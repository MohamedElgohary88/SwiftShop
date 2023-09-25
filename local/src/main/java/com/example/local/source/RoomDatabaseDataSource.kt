package com.example.local.source

import com.example.local.room.SwiftDao
import com.example.repository.source.LocalDataSource
import javax.inject.Inject

class RoomDatabaseDataSource @Inject constructor(
    private val dao: SwiftDao,
) : LocalDataSource {

}