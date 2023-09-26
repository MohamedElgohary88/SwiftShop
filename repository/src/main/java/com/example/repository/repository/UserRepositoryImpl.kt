package com.example.repository.repository

import com.example.entities.user.Login
import com.example.entities.user.User
import com.example.usecases.repository.UserRepository

class UserRepositoryImpl : UserRepository {
    override suspend fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserById(userId: String): User {
        TODO("Not yet implemented")
    }

    override suspend fun getProfileData(token: String): User {
        TODO("Not yet implemented")
    }

    override suspend fun createUser(
        name: String,
        email: String,
        password: String,
        avatar: String
    ): User {
        TODO("Not yet implemented")
    }

    override suspend fun updateUserEmailAndName(userId: String, email: String, name: String): User {
        TODO("Not yet implemented")
    }

    override suspend fun loginUser(email: String, password: String): Login {
        TODO("Not yet implemented")
    }

}