package com.example.mvi_loginapp.feature.loginscreen.impl.data

import com.example.mvi_loginapp.feature.loginscreen.domain.LoginResult

sealed class LoginErrorType {

    object WrongPassword : LoginErrorType()

    object UserNotExists : LoginErrorType()
}

internal fun LoginResult.Failed.toUi(): LoginErrorType = when (this) {
    is LoginResult.Failed.WrongPassword -> LoginErrorType.WrongPassword
    is LoginResult.Failed.UserNotExists -> LoginErrorType.UserNotExists
}
