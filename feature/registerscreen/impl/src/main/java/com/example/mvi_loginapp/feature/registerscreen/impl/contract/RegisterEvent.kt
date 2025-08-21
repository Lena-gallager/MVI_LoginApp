package com.example.mvi_loginapp.feature.registerscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewEvent

sealed class RegisterEvent : ViewEvent {

    data class OnEmailChanged(val newValue: String) : RegisterEvent()

    data class OnPhoneChanged(val newValue: String) : RegisterEvent()

    data class OnPasswordChanged(val newValue: String) : RegisterEvent()

    data class OnConfirmPasswordChanged(val newValue: String) : RegisterEvent()

    object CreateAccountClicked : RegisterEvent()

    object LoginClicked : RegisterEvent()

    object OnBackPressed : RegisterEvent()
}
