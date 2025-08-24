package com.example.mvi_loginapp.feature.registerscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewState
import com.example.mvi_loginapp.feature.registerscreen.impl.data.RegisterDialogType

data class RegisterState(
    val email: String,
    val phone: String,
    val password: String,
    val confirmPassword: String,
    val dialogType: RegisterDialogType?,
) : ViewState {

    companion object {

        val DEFAULT = RegisterState(
            email = "",
            phone = "",
            password = "",
            confirmPassword = "",
            dialogType = null,
        )
    }
}
