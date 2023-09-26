package com.example.repository.response

import com.google.gson.annotations.SerializedName

data class ProductDto(
    @SerializedName("category")
    val categoryDto: CategoryDto,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: List<String>,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val title: String
)