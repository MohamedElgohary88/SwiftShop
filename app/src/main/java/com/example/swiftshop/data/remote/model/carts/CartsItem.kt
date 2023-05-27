package com.example.shoppingstore.model.data.carts


import com.example.shoppingstore.model.data.products.Product
import com.google.gson.annotations.SerializedName

data class CartsItem(
    @SerializedName("date")
    val date: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("products")
    val products: List<Product?>?,
    @SerializedName("userId")
    val userId: Int?,
    @SerializedName("__v")
    val v: Int?
)