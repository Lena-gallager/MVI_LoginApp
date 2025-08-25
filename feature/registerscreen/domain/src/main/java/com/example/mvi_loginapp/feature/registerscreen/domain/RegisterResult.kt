package com.example.mvi_loginapp.feature.registerscreen.domain

sealed class RegisterResult {

    object Success : RegisterResult()

    sealed class Failed : RegisterResult() {

        object UserAlreadyExists : Failed()
        object PasswordsNotMatch : Failed()
    }
}
