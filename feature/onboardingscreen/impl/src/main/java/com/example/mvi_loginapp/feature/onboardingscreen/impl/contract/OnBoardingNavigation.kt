package com.example.mvi_loginapp.feature.onboardingscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewNavigation

sealed class OnBoardingNavigation : ViewNavigation {

    object ToLogin : OnBoardingNavigation()
}
