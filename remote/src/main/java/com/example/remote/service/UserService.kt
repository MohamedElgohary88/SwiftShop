package com.example.remote.service

import com.example.repository.response.LoginDto
import com.example.repository.response.UserDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserService {

    @GET("users")
    suspend fun getUsers(): Response<List<UserDto>>

    @GET("users/{user_id}")
    suspend fun getUserById(@Path("user_id") userId: String): Response<UserDto>

    @GET("auth/profile")
    suspend fun getProfileData(@Header("Authorization") token: String): Response<UserDto>

    @POST("users")
    suspend fun createUser(
        @Body name: String,
        @Body email: String,
        @Body password: String,
        @Body avatar: String
    ): Response<UserDto>

    @PUT("users/{user_id}")
    suspend fun updateUserEmailAndName(
        @Path("user_id") userId: String,
        @Body email: String,
        @Body name: String
    ): Response<UserDto>

    @POST("auth/login")
    suspend fun loginUser(
        @Body email: String,
        @Body password: String
    ): Response<LoginDto>

}