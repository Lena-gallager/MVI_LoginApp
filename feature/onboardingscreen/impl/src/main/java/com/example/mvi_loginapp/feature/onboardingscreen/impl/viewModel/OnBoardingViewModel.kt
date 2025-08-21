package com.example.mvi_loginapp.feature.onboardingscreen.impl.viewModel

import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingEvent
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingNavigation
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingState
import com.example.mvi_loginapp.storage.api.OnBoardingRepository

class OnBoardingViewModel(
    private val onBoardingRepository: OnBoardingRepository,
) : BaseViewModel<OnBoardingEvent, OnBoardingState, OnBoardingNavigation>() {

    //todo screen does not observe state
    override fun setInitialState(): OnBoardingState = OnBoardingState.DEFAULT

    override fun handleEvents(event: OnBoardingEvent) {
        when (event) {
            is OnBoardingEvent.OnFinishClicked -> {
                //todo хуита короче какая то. Если бы я использовала понятие Effect а не navigaiton,
                // то я могла мы послать effect и модуль api сам бы обновил значение репозитория
                // и сам репозиторий находился бы в модуле api а не как сейас в storage...................
                // НО МНЕ НЕ НРАВИТСЯ EFFECT
                onBoardingRepository.isOnBoardingWasPerformed = true
                setNavigation { OnBoardingNavigation.ToLogin }
            }
            is OnBoardingEvent.OnNextClicked -> {}
            is OnBoardingEvent.OnSkipClicked -> {}
        }
    }
}
