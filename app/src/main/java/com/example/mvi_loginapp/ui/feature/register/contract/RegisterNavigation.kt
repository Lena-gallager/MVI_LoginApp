package com.example.mvi_loginapp.ui.feature.register.contract

import com.example.mvi_loginapp.ui.base.ViewNavigation

sealed class RegisterNavigation : ViewNavigation {

    object ToLoginScreen : RegisterNavigation()

    object Back : RegisterNavigation()
}
