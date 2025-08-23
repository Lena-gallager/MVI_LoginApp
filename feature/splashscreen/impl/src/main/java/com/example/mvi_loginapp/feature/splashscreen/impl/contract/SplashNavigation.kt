package com.example.mvi_loginapp.feature.splashscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewNavigation

sealed class SplashNavigation : ViewNavigation {

    object ToLogin : SplashNavigation()

    object ToOnBoarding : SplashNavigation()
}
