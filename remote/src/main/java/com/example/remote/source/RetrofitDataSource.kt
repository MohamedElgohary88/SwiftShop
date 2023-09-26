package com.example.remote.source

import com.example.entities.error.BadRequestException
import com.example.entities.error.NoInternetException
import com.example.entities.error.NotFoundException
import com.example.entities.error.NullResultException
import com.example.entities.error.ServerException
import com.example.entities.error.ValidationException
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

class RetrofitDataSource() : RemoteDataSource {

    override suspend fun getUsers(): List<UserDto> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserById(userId: String): UserDto {
        TODO("Not yet implemented")
    }

    override suspend fun getProfileData(token: String): UserDto {
        TODO("Not yet implemented")
    }

    override suspend fun createUser(
        name: String,
        email: String,
        password: String,
        avatar: String
    ): UserDto {
        TODO("Not yet implemented")
    }

    override suspend fun updateUserEmailAndName(
        userId: String,
        email: String,
        name: String
    ): UserDto {
        TODO("Not yet implemented")
    }

    override suspend fun loginUser(email: String, password: String): LoginDto {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(): List<ProductDto> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(productId: String): ProductDto {
        TODO("Not yet implemented")
    }

    override suspend fun getProductsPagination(offset: Int, limit: Int): List<ProductDto> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<CategoryDto> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategoryById(categoryId: String): CategoryDto {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(request: ProductRequestDto): ProductDto {
        TODO("Not yet implemented")
    }

    override suspend fun updateProduct(
        productId: String,
        request: ProductRequestUpdateDto
    ): ProductDto {
        TODO("Not yet implemented")
    }

    override suspend fun createCategory(name: String, image: String): CategoryDto {
        TODO("Not yet implemented")
    }

    override suspend fun updateCategory(categoryId: String, name: String): CategoryDto {
        TODO("Not yet implemented")
    }

    override suspend fun uploadFile(filePart: MultipartBody.Part): UploadFileDto {
        TODO("Not yet implemented")
    }

    override suspend fun downloadFile(fileName: String): ResponseBody {
        TODO("Not yet implemented")
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