package com.example.mvi_loginapp.ui.common.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mvi_loginapp.ui.common.icons.socialMedia.IcApple
import com.example.mvi_loginapp.ui.common.icons.socialMedia.IcFacebook
import com.example.mvi_loginapp.ui.common.icons.socialMedia.IcGoogle
import com.example.mvi_loginapp.ui.common.icons.socialMedia.SocialMediaIconPack

enum class SocialMediaType(val icon: ImageVector) {
    FACEBOOK(SocialMediaIconPack.IcFacebook),
    GOOGLE(SocialMediaIconPack.IcGoogle),
    APPLE(SocialMediaIconPack.IcApple),
}
