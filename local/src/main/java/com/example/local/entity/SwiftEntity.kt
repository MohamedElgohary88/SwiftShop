package com.example.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SwiftEntity(
    @PrimaryKey
    val id: String
)