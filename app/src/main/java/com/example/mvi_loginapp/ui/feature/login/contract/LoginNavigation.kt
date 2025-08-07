package com.example.mvi_loginapp.ui.feature.login.contract

import com.example.mvi_loginapp.ui.base.ViewNavigation

sealed class LoginNavigation : ViewNavigation {

    object Back : LoginNavigation()

    object ToRegistrationScreen : LoginNavigation()
}
