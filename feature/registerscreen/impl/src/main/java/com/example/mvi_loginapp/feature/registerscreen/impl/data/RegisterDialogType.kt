package com.example.mvi_loginapp.feature.registerscreen.impl.data

import com.example.mvi_loginapp.core.uicomponents.data.SocialMediaType

sealed class RegisterDialogType {

    data class SocialMedia(val type: SocialMediaType) : RegisterDialogType()
}
