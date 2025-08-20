package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.uicomponents.viewModel.ViewEvent

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
