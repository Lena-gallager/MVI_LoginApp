package com.example.mvi_loginapp.ui.feature.splash

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.core.navigation.NavigationRoutes
import com.example.mvi_loginapp.feature.onboardingscreen.data.OnBoardingRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

//todo должен находится в модуле :feature:splashscreen:**
// мб лучше использовать отдельный composable screen for splash? cause now i use androidx.core.splashscreen
class SplashViewModel(
    onBoardingRepository: OnBoardingRepository,
) : ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    //todo read about stateFlow and etc
    private val _startDestination: MutableState<String> = mutableStateOf(NavigationRoutes.ON_BOARDING)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            if (onBoardingRepository.isOnBoardingWasPerformed) {
                _startDestination.value = NavigationRoutes.LOGIN
            } else {
                _startDestination.value = NavigationRoutes.ON_BOARDING
            }
            delay(1000)
            _isLoading.value = false
        }
    }
}
