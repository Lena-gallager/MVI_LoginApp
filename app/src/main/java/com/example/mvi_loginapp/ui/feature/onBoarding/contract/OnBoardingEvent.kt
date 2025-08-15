package com.example.mvi_loginapp.ui.feature.onBoarding.contract

import com.example.mvi_loginapp.ui.base.ViewEvent

sealed class OnBoardingEvent : ViewEvent {

    object OnSkipClicked : OnBoardingEvent()

    object OnNextClicked : OnBoardingEvent()

    object OnFinishClicked : OnBoardingEvent()
}
