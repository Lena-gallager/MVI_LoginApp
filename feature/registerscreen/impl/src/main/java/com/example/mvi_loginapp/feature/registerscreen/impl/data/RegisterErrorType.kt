package com.example.mvi_loginapp.feature.registerscreen.impl.data

import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterResult

sealed class RegisterErrorType {

    object UserAlreadyExists : RegisterErrorType()

    object PasswordsNotMatch : RegisterErrorType()
}

internal fun RegisterResult.Failed.toUi(): RegisterErrorType = when (this) {
    is RegisterResult.Failed.UserAlreadyExists -> RegisterErrorType.UserAlreadyExists
    is RegisterResult.Failed.PasswordsNotMatch -> RegisterErrorType.PasswordsNotMatch
}
