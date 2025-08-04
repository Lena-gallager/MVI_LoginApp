package com.example.mvi_loginapp.ui.common.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mvi_loginapp.ui.common.MyIconPack
import com.example.mvi_loginapp.ui.common.myiconpack.IcApple
import com.example.mvi_loginapp.ui.common.myiconpack.IcFacebook
import com.example.mvi_loginapp.ui.common.myiconpack.IcGoogle

enum class SocialMediaType(val icon: ImageVector) {
    FACEBOOK(MyIconPack.IcFacebook),
    GOOGLE(MyIconPack.IcGoogle),
    APPLE(MyIconPack.IcApple),
}
