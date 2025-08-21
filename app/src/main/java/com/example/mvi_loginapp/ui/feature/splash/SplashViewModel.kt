package com.example.mvi_loginapp.ui.feature.splash

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.data.UserInteractionRepository
import com.example.mvi_loginapp.feature.loginscreen.api.navigation.LoginNavigationRoute
import com.example.mvi_loginapp.feature.onboardingscreen.api.navigation.OnBoardingNavigationRoute
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel(
    userInteractionRepository: UserInteractionRepository,
) : ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    //todo read about stateFlow and etc
    private val _startDestination: MutableState<String> = mutableStateOf(OnBoardingNavigationRoute.ROUTE)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            if (userInteractionRepository.isOnBoardingWasPerformed) {
                _startDestination.value = LoginNavigationRoute.ROUTE
            } else {
                _startDestination.value = OnBoardingNavigationRoute.ROUTE
            }
            delay(1000)
            _isLoading.value = false
        }
    }
}
