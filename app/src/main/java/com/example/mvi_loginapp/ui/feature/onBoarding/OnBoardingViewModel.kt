package com.example.mvi_loginapp.ui.feature.onBoarding

import com.example.mvi_loginapp.data.UserInteractionRepository
import com.example.mvi_loginapp.ui.base.BaseViewModel
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingEvent
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingNavigation
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingState

class OnBoardingViewModel(
    private val userInteractionRepository: UserInteractionRepository,
) : BaseViewModel<OnBoardingEvent, OnBoardingState, OnBoardingNavigation>() {

    //todo screen does not observe state
    override fun setInitialState(): OnBoardingState = OnBoardingState.DEFAULT

    override fun handleEvents(event: OnBoardingEvent) {
        when (event) {
            is OnBoardingEvent.OnFinishClicked -> {
                userInteractionRepository.isOnBoardingWasPerformed = true
                setNavigation { OnBoardingNavigation.ToLogin }
            }
            is OnBoardingEvent.OnNextClicked -> {}
            is OnBoardingEvent.OnSkipClicked -> {}
        }
    }
}
