package com.example.repository.repository

import com.example.entities.product.Category
import com.example.entities.product.Product
import com.example.entities.product.ProductRequest
import com.example.entities.product.ProductRequestUpdate
import com.example.entities.product.UploadFile
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
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(productId: String): Product {
        TODO("Not yet implemented")
    }

    override suspend fun getProductsPagination(offset: Int, limit: Int): List<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<Category> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategoryById(categoryId: String): Category {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(product: ProductRequest): Product {
        TODO("Not yet implemented")
    }

    override suspend fun updateProduct(productId: String, product: ProductRequestUpdate): Product {
        TODO("Not yet implemented")
    }

    override suspend fun createCategory(name: String, image: String): Category {
        TODO("Not yet implemented")
    }

    override suspend fun updateCategory(categoryId: String, name: String): Category {
        TODO("Not yet implemented")
    }

    override suspend fun uploadFile(file: File): UploadFile {
        val requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file)
        val filePart = MultipartBody.Part.createFormData("file", file.name, requestFile)
        TODO("Not yet implemented")
    }

    override suspend fun downloadFile(fileName: String): Boolean {
        TODO("Not yet implemented")
    }

}