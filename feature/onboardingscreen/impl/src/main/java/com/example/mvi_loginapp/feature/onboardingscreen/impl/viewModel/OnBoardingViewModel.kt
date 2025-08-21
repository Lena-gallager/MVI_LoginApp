package com.example.mvi_loginapp.feature.onboardingscreen.impl.viewModel

import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingEvent
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingNavigation
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingState

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
