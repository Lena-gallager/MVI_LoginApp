package com.example.mvi_loginapp.feature.registerscreen.domain

data class RegisterModel(
    val email: String,
    val phone: String,
    val password: String,
    val confirmPassword: String,
)
