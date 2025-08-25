package com.example.mvi_loginapp.feature.registerscreen.domain

interface RegisterInteractor {

    suspend fun register(model: RegisterModel): RegisterResult
}
