package com.example.mvi_loginapp.feature.loginscreen.impl.data

import com.example.mvi_loginapp.core.uicomponents.data.SocialMediaType

sealed class LoginDialogType {

    object PasswordChange : LoginDialogType()

    data class SocialMedia(val type: SocialMediaType) : LoginDialogType()
}
