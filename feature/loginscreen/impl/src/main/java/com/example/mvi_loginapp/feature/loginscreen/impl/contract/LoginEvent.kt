package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.uicomponents.data.SocialMediaType
import com.example.mvi_loginapp.core.viewModel.ViewEvent

sealed class LoginEvent : ViewEvent {

    data class OnEmailChanged(val newValue: String) : LoginEvent()

    data class OnPasswordChanged(val newValue: String) : LoginEvent()

    object OnForgotPasswordCLicked : LoginEvent()

    object OnLoginClicked : LoginEvent()

    object OnRegisterClicked : LoginEvent()

    data class OnSocialMediaClicked(val type: SocialMediaType) : LoginEvent()

    object OnDismissDialog : LoginEvent()

    object ResetError : LoginEvent()
}
