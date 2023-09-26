package com.example.repository.response

data class LoginDto(
    val accessToken: String,
    val refreshToken: String
)