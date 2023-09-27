package com.example.usecases

import com.example.entities.product.Category
import com.example.entities.product.Product
import com.example.entities.product.ProductRequest
import com.example.entities.product.ProductRequestUpdate
import com.example.entities.product.UploadFile
import com.example.usecases.repository.ProductsRepository
import java.io.File
import java.util.Random
import javax.inject.Inject

class ManageProductsUseCase @Inject constructor(
    private val productsRepository: ProductsRepository,
    private val random: Random
) {

    suspend fun getAllProducts(): List<Product> {
        return productsRepository.getProducts().shuffled(random)
    }

    suspend fun getProductById(productId: String): Product {
        return productsRepository.getProductById(productId)
    }

    suspend fun getProductsPagination(offset: Int, limit: Int): List<Product> {
        return productsRepository.getProductsPagination(offset, limit).shuffled(random)
    }

    suspend fun createProduct(product: ProductRequest): Product {
        return productsRepository.createProduct(product)
    }

    suspend fun updateProduct(productId: String, product: ProductRequestUpdate): Product {
        return productsRepository.updateProduct(productId, product)
    }

    suspend fun uploadFile(file: File): UploadFile {
        return productsRepository.uploadFile(file)
    }

    suspend fun downloadFile(fileName: String): String {
        return productsRepository.downloadFile(fileName)
    }
}