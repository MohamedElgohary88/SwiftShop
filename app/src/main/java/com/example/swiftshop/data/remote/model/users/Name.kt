package com.example.shoppingstore.model.data.users


import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("firstname")
    val firstname: String?,
    @SerializedName("lastname")
    val lastname: String?
)