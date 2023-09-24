package com.example.repository.response

data class ProductDto(
    val categoryDto: CategoryDto,
    val description: String,
    val id: Int,
    val images: List<String>,
    val price: Int,
    val title: String
)