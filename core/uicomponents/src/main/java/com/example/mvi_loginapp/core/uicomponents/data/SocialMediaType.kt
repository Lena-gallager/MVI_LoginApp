package com.example.mvi_loginapp.core.uicomponents.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mvi_loginapp.core.uicomponents.icons.socialMedia.IcApple
import com.example.mvi_loginapp.core.uicomponents.icons.socialMedia.IcFacebook
import com.example.mvi_loginapp.core.uicomponents.icons.socialMedia.IcGoogle
import com.example.mvi_loginapp.core.uicomponents.icons.socialMedia.SocialMediaIconPack

enum class SocialMediaType(val icon: ImageVector) {
    FACEBOOK(SocialMediaIconPack.IcFacebook),
    GOOGLE(SocialMediaIconPack.IcGoogle),
    APPLE(SocialMediaIconPack.IcApple),
}