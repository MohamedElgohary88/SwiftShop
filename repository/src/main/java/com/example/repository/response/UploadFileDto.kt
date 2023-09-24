package com.example.repository.response

data class UploadFileDto(
    val originalName: String,
    val fileName: String,
    val location: String
)