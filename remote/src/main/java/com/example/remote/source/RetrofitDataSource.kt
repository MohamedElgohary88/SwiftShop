package com.example.remote.source

import com.example.entities.error.BadRequestException
import com.example.entities.error.NoInternetException
import com.example.entities.error.NotFoundException
import com.example.entities.error.NullResultException
import com.example.entities.error.ServerException
import com.example.entities.error.ValidationException
import com.example.remote.service.ProductService
import com.example.remote.service.UserService
import com.example.repository.request.ProductRequestDto
import com.example.repository.request.ProductRequestUpdateDto
import com.example.repository.response.CategoryDto
import com.example.repository.response.LoginDto
import com.example.repository.response.ProductDto
import com.example.repository.response.UploadFileDto
import com.example.repository.response.UserDto
import com.example.repository.source.RemoteDataSource
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response
import java.io.IOException
import java.net.UnknownHostException
import javax.inject.Inject

class RetrofitDataSource @Inject constructor(
    private val productService: ProductService,
    private val userService: UserService
) : RemoteDataSource {

    override suspend fun getUsers(): List<UserDto> {
        return wrapApiCall { userService.getUsers() }
    }

    override suspend fun getUserById(userId: String): UserDto {
        return wrapApiCall { userService.getUserById(userId) }
    }

    override suspend fun getProfileData(token: String): UserDto {
        return wrapApiCall { userService.getProfileData(token) }
    }

    override suspend fun createUser(
        name: String,
        email: String,
        password: String,
        avatar: String
    ): UserDto {
        return wrapApiCall { userService.createUser(name, email, password, avatar) }
    }

    override suspend fun updateUserEmailAndName(
        userId: String,
        email: String,
        name: String
    ): UserDto {
        return wrapApiCall { userService.updateUserEmailAndName(userId, email, name) }
    }

    override suspend fun loginUser(email: String, password: String): LoginDto {
        return wrapApiCall { userService.loginUser(email, password) }
    }

    override suspend fun getProducts(): List<ProductDto> {
        return wrapApiCall { productService.getProducts() }
    }

    override suspend fun getProductById(productId: String): ProductDto {
        return wrapApiCall { productService.getProductById(productId) }
    }

    override suspend fun getProductsPagination(offset: Int, limit: Int): List<ProductDto> {
        return wrapApiCall { productService.getProductsPagination(offset, limit) }
    }

    override suspend fun getCategories(): List<CategoryDto> {
        return wrapApiCall { productService.getCategories() }
    }

    override suspend fun getCategoryById(categoryId: String): CategoryDto {
        return wrapApiCall { productService.getCategoryById(categoryId) }
    }

    override suspend fun createProduct(product: ProductRequestDto): ProductDto {
        return wrapApiCall { productService.createProduct(product) }
    }

    override suspend fun updateProduct(
        productId: String,
        product: ProductRequestUpdateDto
    ): ProductDto {
        return wrapApiCall { productService.updateProduct(productId, product) }
    }

    override suspend fun createCategory(name: String, image: String): CategoryDto {
        return wrapApiCall { productService.createCategory(name, image) }
    }

    override suspend fun updateCategory(categoryId: String, name: String): CategoryDto {
        return wrapApiCall { productService.updateCategory(categoryId, name) }
    }

    override suspend fun uploadFile(filePart: MultipartBody.Part): UploadFileDto {
        return wrapApiCall { productService.uploadFile(filePart) }
    }

    override suspend fun downloadFile(fileName: String): ResponseBody {
        return wrapApiCall { productService.downloadFile(fileName) }
    }

    private suspend fun <T> wrapApiCall(function: suspend () -> Response<T>): T {
        try {
            val response = function()
            if (response.isSuccessful) {
                return response.body() ?: throw NullResultException("No data")
            } else {
                throw when (response.code()) {
                    400 -> BadRequestException(response.message())
                    401 -> ValidationException("Invalid username or password")
                    404 -> NotFoundException("Not found")
                    else -> ServerException("Server error")
                }
            }
        } catch (e: UnknownHostException) {
            throw NoInternetException("no Internet")
        } catch (io: IOException) {
            throw NoInternetException(io.message)
        }
    }
}