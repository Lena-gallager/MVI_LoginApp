package com.example.mvi_loginapp.ui.feature.splash

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.ui.navigation.Navigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

//todo choose witch DI to use and add repository that will save whether on_boarding was performed or not
// see https://medium.com/@ihaydinn/creating-a-stylish-onboarding-page-with-jetpack-compose-in-android-bd93e525920b
class SplashViewModel : ViewModel() {

    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    //todo read about stateFlow and etc
    private val _startDestination: MutableState<String> = mutableStateOf(Navigation.Routes.ON_BOARDING)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            //todo from repository
            if (true) {
                _startDestination.value = Navigation.Routes.ON_BOARDING
            }
            delay(1000)
            _isLoading.value = false
        }
    }
}
