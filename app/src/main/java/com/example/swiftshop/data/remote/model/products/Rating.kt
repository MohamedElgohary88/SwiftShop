package com.example.shoppingstore.model.data.products


import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("rate")
    val rate: Double?
)