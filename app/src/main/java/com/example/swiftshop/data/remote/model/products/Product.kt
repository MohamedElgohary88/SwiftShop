package com.example.shoppingstore.model.data.products


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("productId")
    val productId: Int?,
    @SerializedName("quantity")
    val quantity: Int?
)