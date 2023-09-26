package com.example.entities.product

data class ProductRequestUpdate(
    val title: String,
    val price: Int,
    val images: List<String>
)
