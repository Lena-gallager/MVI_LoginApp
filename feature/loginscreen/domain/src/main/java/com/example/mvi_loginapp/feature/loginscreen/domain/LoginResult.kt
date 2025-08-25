package com.example.mvi_loginapp.feature.loginscreen.domain

sealed class LoginResult {

    object Success : LoginResult()

    sealed class Failed : LoginResult() {

        object WrongPassword : Failed()

        object UserNotExists : Failed()
    }
}
