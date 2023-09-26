package com.example.usecases.repository

import com.example.entities.product.Category
import com.example.entities.product.Product
import com.example.entities.product.ProductRequest
import com.example.entities.product.ProductRequestUpdate
import com.example.entities.product.UploadFile
import java.io.File

interface ProductsRepository {

    suspend fun getProducts(): List<Product>

    suspend fun getProductById(productId: String): Product

    suspend fun getProductsPagination(offset: Int, limit: Int): List<Product>

    suspend fun getCategories(): List<Category>

    suspend fun getCategoryById(categoryId: String): Category

    suspend fun createProduct(product: ProductRequest): Product

    suspend fun updateProduct(productId: String, product: ProductRequestUpdate): Product

    suspend fun createCategory(name: String, image: String): Category

    suspend fun updateCategory(categoryId: String, name: String): Category

    suspend fun uploadFile(file: File): UploadFile

    suspend fun downloadFile(fileName: String): Boolean

}