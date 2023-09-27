package com.example.usecases

import com.example.entities.user.Login
import com.example.entities.user.User
import com.example.usecases.repository.UserRepository
import javax.inject.Inject

class ManageUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend fun getUsers(): List<User> {
        return userRepository.getUsers()
    }

    suspend fun getUserById(userId: String): User {
        return userRepository.getUserById(userId)
    }

    suspend fun getProfileData(token: String): User {
        return userRepository.getProfileData(token)
    }

    suspend fun createUser(name: String, email: String, password: String, avatar: String): User {
        return userRepository.createUser(name, email, password, avatar)
    }

    suspend fun updateUserEmailAndName(userId: String, email: String, name: String): User {
        return userRepository.updateUserEmailAndName(userId, email, name)
    }

    suspend fun loginUser(email: String, password: String): Login {
        return userRepository.loginUser(email, password)
    }

}