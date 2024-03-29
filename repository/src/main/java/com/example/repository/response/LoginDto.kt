package com.example.repository.response

import com.google.gson.annotations.SerializedName

data class LoginDto(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("refresh_token")
    val refreshToken: String
)