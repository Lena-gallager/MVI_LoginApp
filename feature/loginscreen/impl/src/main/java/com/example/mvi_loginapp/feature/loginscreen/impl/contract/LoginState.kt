package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewState

data class LoginState(
    val email: String,
    val password: String,
) : ViewState {

    companion object {

        val DEFAULT = LoginState(
            email = "",
            password = "",
        )
    }
}
