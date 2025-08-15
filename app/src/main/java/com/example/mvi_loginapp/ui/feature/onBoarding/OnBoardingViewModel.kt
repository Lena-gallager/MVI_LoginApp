package com.example.mvi_loginapp.ui.feature.onBoarding

import com.example.mvi_loginapp.ui.base.BaseViewModel
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingEvent
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingNavigation
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingState

class OnBoardingViewModel : BaseViewModel<OnBoardingEvent, OnBoardingState, OnBoardingNavigation>() {

    override fun setInitialState(): OnBoardingState = OnBoardingState.DEFAULT

    override fun handleEvents(event: OnBoardingEvent) {
        when (event) {
            is OnBoardingEvent.OnFinishClicked -> setNavigation { OnBoardingNavigation.ToLogin }
            is OnBoardingEvent.OnNextClicked -> {}
            is OnBoardingEvent.OnSkipClicked -> {}
        }
    }
}
