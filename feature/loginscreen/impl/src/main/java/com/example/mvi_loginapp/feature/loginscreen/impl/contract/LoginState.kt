package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewState
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginDialogType
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginErrorType

data class LoginState(
    val email: String,
    val password: String,
    val dialogType: LoginDialogType?,
    val errorType: LoginErrorType?,
) : ViewState {

    companion object {

        val DEFAULT = LoginState(
            email = "",
            password = "",
            dialogType = null,
            errorType = null,
        )
    }
}
