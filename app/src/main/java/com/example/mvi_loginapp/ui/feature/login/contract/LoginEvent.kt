package com.example.mvi_loginapp.ui.feature.login.contract

import com.example.mvi_loginapp.ui.base.ViewEvent

sealed class LoginEvent : ViewEvent {

    data class OnEmailChanged(val newValue: String) : LoginEvent()

    data class OnPasswordChanged(val newValue: String) : LoginEvent()

    object OnForgotPasswordCLicked : LoginEvent()

    object OnLoginClicked : LoginEvent()

    object OnRegisterClicked : LoginEvent()

    object onFacebookClicked : LoginEvent()

    object onGoogleClicked : LoginEvent()

    object onAppleClicked : LoginEvent()
}
