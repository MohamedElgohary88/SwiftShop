package com.example.repository.repository

import com.example.entities.product.Category
import com.example.entities.product.Product
import com.example.entities.product.ProductRequest
import com.example.entities.product.ProductRequestUpdate
import com.example.entities.product.UploadFile
import com.example.repository.mapper.toDto
import com.example.repository.mapper.toEntity
import com.example.repository.source.RemoteDataSource
import com.example.usecases.repository.ProductsRepository
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import java.io.File
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : ProductsRepository {
    override suspend fun getProducts(): List<Product> {
        return remoteDataSource.getProducts().map { it.toEntity() }
    }

    override suspend fun getProductById(productId: String): Product {
        return remoteDataSource.getProductById(productId).toEntity()
    }

    override suspend fun getProductsPagination(offset: Int, limit: Int): List<Product> {
        return remoteDataSource.getProductsPagination(offset, limit).map { it.toEntity() }
    }

    override suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories().map { it.toEntity() }
    }

    override suspend fun getCategoryById(categoryId: String): Category {
        return remoteDataSource.getCategoryById(categoryId).toEntity()
    }

    override suspend fun createProduct(product: ProductRequest): Product {
        return remoteDataSource.createProduct(product.toDto()).toEntity()
    }

    override suspend fun updateProduct(productId: String, product: ProductRequestUpdate): Product {
        return remoteDataSource.updateProduct(productId, product.toDto()).toEntity()
    }

    override suspend fun createCategory(name: String, image: String): Category {
        return remoteDataSource.createCategory(name, image).toEntity()
    }

    override suspend fun updateCategory(categoryId: String, name: String): Category {
        return remoteDataSource.updateCategory(categoryId, name).toEntity()
    }

    override suspend fun uploadFile(file: File): UploadFile {
        val requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file)
        val filePart = MultipartBody.Part.createFormData("file", file.name, requestFile)
        return remoteDataSource.uploadFile(filePart).toEntity()
    }

    override suspend fun downloadFile(fileName: String): String {
        return remoteDataSource.downloadFile(fileName).string()
    }

}