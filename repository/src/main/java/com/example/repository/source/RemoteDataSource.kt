package com.example.repository.source

import com.example.repository.request.ProductRequestDto
import com.example.repository.request.ProductRequestUpdateDto
import com.example.repository.response.CategoryDto
import com.example.repository.response.LoginDto
import com.example.repository.response.ProductDto
import com.example.repository.response.UploadFileDto
import com.example.repository.response.UserDto
import okhttp3.MultipartBody
import okhttp3.ResponseBody

interface RemoteDataSource {

    //region user
    suspend fun getUsers(): List<UserDto>
    suspend fun getUserById(userId: String): UserDto
    suspend fun getProfileData(token: String): UserDto
    suspend fun createUser(name: String, email: String, password: String, avatar: String): UserDto
    suspend fun updateUserEmailAndName(userId: String, email: String, name: String): UserDto
    suspend fun loginUser(email: String, password: String): LoginDto
    //endregion

    //region products

    suspend fun getProducts(): List<ProductDto>

    suspend fun getProductById(productId: String): ProductDto

    suspend fun getProductsPagination(offset: Int, limit: Int): List<ProductDto>

    suspend fun getCategories(): List<CategoryDto>

    suspend fun getCategoryById(categoryId: String): CategoryDto

    suspend fun createProduct(product: ProductRequestDto): ProductDto

    suspend fun updateProduct(productId: String, product: ProductRequestUpdateDto): ProductDto

    suspend fun createCategory(name: String, image: String): CategoryDto

    suspend fun updateCategory(categoryId: String, name: String): CategoryDto

    suspend fun uploadFile(filePart: MultipartBody.Part): UploadFileDto

    suspend fun downloadFile(fileName: String): ResponseBody

    //endregion

}