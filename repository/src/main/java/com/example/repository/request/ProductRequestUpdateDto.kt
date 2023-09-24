package com.example.repository.request

data class ProductRequestUpdateDto(
    val title: String,
    val price: Int,
    val images: List<String>
)