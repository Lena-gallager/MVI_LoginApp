package com.example.mvi_loginapp.feature.onboardingscreen.impl.contract

import com.example.mvi_loginapp.core.viewModel.ViewEvent

sealed class OnBoardingEvent : ViewEvent {

    object OnSkipClicked : OnBoardingEvent()

    object OnNextClicked : OnBoardingEvent()

    object OnFinishClicked : OnBoardingEvent()
}
