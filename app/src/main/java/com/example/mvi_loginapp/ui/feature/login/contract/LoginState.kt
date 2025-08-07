package com.example.mvi_loginapp.ui.feature.login.contract

import com.example.mvi_loginapp.ui.base.ViewState

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
