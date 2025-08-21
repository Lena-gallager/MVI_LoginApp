package com.example.mvi_loginapp.feature.onboardingscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewState
import com.example.mvi_loginapp.feature.onboardingscreen.impl.R

data class OnBoardingState(
    val imageRes: Int,
    val title: String,
    val description: String,
) : ViewState {

    companion object {

        val DEFAULT = OnBoardingState(
            title = "Welcome to AppName",
            description = "Here you wont be able to do anything",
            imageRes = R.drawable.ic_onboarding_1,
        )
    }
}
