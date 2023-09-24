package com.example.remote.service

import com.example.repository.request.ProductRequestDto
import com.example.repository.request.ProductRequestUpdateDto
import com.example.repository.response.CategoryDto
import com.example.repository.response.ProductDto
import com.example.repository.response.UploadFileDto
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductService {

    @GET("products")
    suspend fun getProducts(): Response<List<ProductDto>>

    @GET("products/{product_id}")
    suspend fun getProductById(@Path("product_id") productId: String): Response<ProductDto>

    @GET("products")
    suspend fun getProductsPagination(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<List<ProductDto>>

    @GET("categories")
    suspend fun getCategories(): Response<List<CategoryDto>>

    @GET("categories/{category_id}")
    suspend fun getCategoryById(@Path("category_id") categoryId: String): Response<CategoryDto>

    @POST("products")
    suspend fun createProduct(@Body request: ProductRequestDto): Response<ProductDto>

    @PUT("products/{product_id}")
    suspend fun updateProduct(
        @Path("product_id") productId: String,
        @Body request: ProductRequestUpdateDto
    ): Response<ProductDto>

    @POST("categories")
    suspend fun createCategory(
        @Body name: String,
        @Body image: String
    ): Response<CategoryDto>

    @PUT("categories/{category_id}")
    suspend fun updateCategory(
        @Path("category_id") categoryId: String,
        @Body name: String
    ): Response<CategoryDto>

    @Multipart
    @POST("files/upload")
    suspend fun uploadFile(@Part filePart: MultipartBody.Part): Response<UploadFileDto>

    @GET("files/{file_name}")
    suspend fun downloadFile(@Path("file_name") fileName: String): Response<ResponseBody>

}