package com.example.mvi_loginapp.ui.feature.onBoarding.contract

import com.example.mvi_loginapp.ui.base.ViewNavigation

sealed class OnBoardingNavigation : ViewNavigation {

    object ToLogin : OnBoardingNavigation()
}
