package com.example.mvi_loginapp.ui.feature.register.contract

import com.example.mvi_loginapp.ui.base.ViewEvent

sealed class RegisterEvent : ViewEvent {

    data class OnEmailChanged(val newValue: String) : RegisterEvent()

    data class OnPhoneChanged(val newValue: String) : RegisterEvent()

    data class OnPasswordChanged(val newValue: String) : RegisterEvent()

    data class OnConfirmPasswordChanged(val newValue: String) : RegisterEvent()

    object CreateAccountClicked : RegisterEvent()

    object LoginClicked : RegisterEvent()

    object OnBackPressed : RegisterEvent()
}
