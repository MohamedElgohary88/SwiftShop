package com.example.repository.mapper

import com.example.entities.user.Login
import com.example.entities.user.User
import com.example.repository.response.LoginDto
import com.example.repository.response.UserDto

fun UserDto.toEntity(): User {
    return User(
        avatar = avatar, email = email, id = id, name = name, password = password, role = role
    )
}

fun LoginDto.toEntity(): Login {
    return Login(accessToken = accessToken, refreshToken = refreshToken)
}