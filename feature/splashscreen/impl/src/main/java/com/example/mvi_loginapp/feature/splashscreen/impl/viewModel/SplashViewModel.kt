package com.example.mvi_loginapp.feature.splashscreen.impl.viewModel

import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.onboardingscreen.data.OnBoardingRepository
import com.example.mvi_loginapp.feature.splashscreen.impl.contract.SplashEvent
import com.example.mvi_loginapp.feature.splashscreen.impl.contract.SplashNavigation
import com.example.mvi_loginapp.feature.splashscreen.impl.contract.SplashState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel(
    onBoardingRepository: OnBoardingRepository,
) : BaseViewModel<SplashEvent, SplashState, SplashNavigation>() {

    override fun setInitialState(): SplashState = SplashState()

    override fun handleEvents(event: SplashEvent) = Unit

    init {
        viewModelScope.launch {
            delay(2000)
            if (onBoardingRepository.isOnBoardingWasPerformed) {
                setNavigation { SplashNavigation.ToLogin }
            } else {
                setNavigation { SplashNavigation.ToOnBoarding }
            }
        }
    }
}
