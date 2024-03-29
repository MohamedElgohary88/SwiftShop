package com.example.entities.product

data class Product(
    val category: Category,
    val description: String,
    val id: Int,
    val images: List<String>,
    val price: Int,
    val title: String
)
