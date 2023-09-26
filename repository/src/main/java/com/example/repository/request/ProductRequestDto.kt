package com.example.repository.request

data class ProductRequestDto(
    val title: String,
    val price: Int,
    val description: String,
    val categoryId: Int,
    val images: List<String>
)