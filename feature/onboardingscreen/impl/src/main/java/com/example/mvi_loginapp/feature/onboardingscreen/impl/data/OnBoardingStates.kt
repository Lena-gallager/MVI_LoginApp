package com.example.mvi_loginapp.feature.onboardingscreen.impl.data

import com.example.mvi_loginapp.feature.onboardingscreen.impl.R
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingState

val OnBoardingStates = listOf(
    OnBoardingState(
        title = "Welcome to AppName",
        description = "Here you wont be able to do anything",
        imageRes = R.drawable.ic_onboarding_1,
    ),
    OnBoardingState(
        title = "But",
        description = "You can take a look at how i implemented text clicks",
        imageRes = R.drawable.ic_onboarding_2,
    ),
    OnBoardingState(
        title = "And also",
        description = "You can navigate through TWOOOO screens. That is awesome, dont u think so?",
        imageRes = R.drawable.ic_onboarding_3,
    ),
)
