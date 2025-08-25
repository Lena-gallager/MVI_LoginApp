package com.example.mvi_loginapp.feature.loginscreen.domain

interface LoginInteractor {

    suspend fun login(model: LoginModel) : LoginResult
}
