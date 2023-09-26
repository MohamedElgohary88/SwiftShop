package com.example.repository.response

import com.google.gson.annotations.SerializedName

data class UploadFileDto(
    @SerializedName("originalname")
    val originalName: String,
    @SerializedName("filename")
    val fileName: String,
    @SerializedName("location")
    val location: String
)