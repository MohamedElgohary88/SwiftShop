package com.example.usecases.repository

import com.example.entities.user.Login
import com.example.entities.user.User

interface UserRepository {
    suspend fun getUsers(): List<User>
    suspend fun getUserById(userId: String): User
    suspend fun getProfileData(token: String): User
    suspend fun createUser(name: String, email: String, password: String, avatar: String): User
    suspend fun updateUserEmailAndName(userId: String, email: String, name: String): User
    suspend fun loginUser(email: String, password: String): Login

}