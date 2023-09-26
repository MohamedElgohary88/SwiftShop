package com.example.repository.repository

import com.example.entities.user.Login
import com.example.entities.user.User
import com.example.repository.mapper.toEntity
import com.example.repository.source.RemoteDataSource
import com.example.usecases.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : UserRepository {
    override suspend fun getUsers(): List<User> {
        return remoteDataSource.getUsers().map { it.toEntity() }
    }

    override suspend fun getUserById(userId: String): User {
        return remoteDataSource.getUserById(userId).toEntity()
    }

    override suspend fun getProfileData(token: String): User {
        return remoteDataSource.getProfileData(token).toEntity()
    }

    override suspend fun createUser(
        name: String,
        email: String,
        password: String,
        avatar: String
    ): User {
        return remoteDataSource.createUser(name, email, password, avatar).toEntity()
    }

    override suspend fun updateUserEmailAndName(userId: String, email: String, name: String): User {
        return remoteDataSource.updateUserEmailAndName(userId, email, name).toEntity()
    }

    override suspend fun loginUser(email: String, password: String): Login {
        return remoteDataSource.loginUser(email, password).toEntity()
    }

}