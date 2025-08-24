package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewState
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginDialogType

data class LoginState(
    val email: String,
    val password: String,
    val dialogType: LoginDialogType?,
) : ViewState {

    companion object {

        val DEFAULT = LoginState(
            email = "",
            password = "",
            dialogType = null,
        )
    }
}
