package com.example.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.local.entity.SwiftEntity


@Database(entities = [SwiftEntity::class], version = 1)
abstract class SwiftDatabase : RoomDatabase() {
    abstract fun getSwiftDao(): SwiftDao
}