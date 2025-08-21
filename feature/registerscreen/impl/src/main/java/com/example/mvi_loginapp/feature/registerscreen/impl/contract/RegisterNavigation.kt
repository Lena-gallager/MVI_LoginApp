package com.example.mvi_loginapp.feature.registerscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewNavigation

sealed class RegisterNavigation : ViewNavigation {

    object ToLoginScreen : RegisterNavigation()

    object Back : RegisterNavigation()
}
