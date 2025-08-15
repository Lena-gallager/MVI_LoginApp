package com.example.mvi_loginapp.ui.feature.onBoarding.contract

import com.example.mvi_loginapp.R
import com.example.mvi_loginapp.ui.base.ViewState

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
