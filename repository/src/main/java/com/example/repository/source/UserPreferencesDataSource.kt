package com.example.repository.source

interface UserPreferencesDataSource {

    suspend fun setUserToken(token: String)

    suspend fun getUserToken(): String?

}