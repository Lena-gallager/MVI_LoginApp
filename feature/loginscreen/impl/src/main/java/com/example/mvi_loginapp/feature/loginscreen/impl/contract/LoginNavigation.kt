package com.example.mvi_loginapp.feature.loginscreen.impl.contract

import com.example.mvi_loginapp.core.uicomponents.viewModel.ViewNavigation

sealed class LoginNavigation : ViewNavigation {

    object ToRegistrationScreen : LoginNavigation()
}
