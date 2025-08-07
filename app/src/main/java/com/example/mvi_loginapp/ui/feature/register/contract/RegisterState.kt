package com.example.mvi_loginapp.ui.feature.register.contract

import com.example.mvi_loginapp.ui.base.ViewState

data class RegisterState(
    val email: String,
    val phone: String,
    val password: String,
    val confirmPassword: String,
) : ViewState {

    companion object {

        val DEFAULT = RegisterState(
            email = "",
            phone = "",
            password = "",
            confirmPassword = "",
        )
    }
}
