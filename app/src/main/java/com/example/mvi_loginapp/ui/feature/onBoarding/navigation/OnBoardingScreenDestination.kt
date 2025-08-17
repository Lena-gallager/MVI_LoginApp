package com.example.mvi_loginapp.ui.feature.onBoarding.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.onBoarding.OnBoardingViewModel
import com.example.mvi_loginapp.ui.feature.onBoarding.composable.OnBoardingScreen
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingNavigation
import com.example.mvi_loginapp.ui.feature.onBoarding.data.OnBoardingStates
import com.example.mvi_loginapp.ui.navigation.Navigation
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach

@Composable
fun OnBoardingScreenDestination(navController: NavController) {

    val viewModel: OnBoardingViewModel = viewModel<OnBoardingViewModel>()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is OnBoardingNavigation.ToLogin -> navController.navigate(route = Navigation.Routes.LOGIN) {
                    popUpTo(Navigation.Routes.ON_BOARDING) { inclusive = true }
                }
            }
        }.collect()
    }

    OnBoardingScreen(
        states = OnBoardingStates,
        onEventSent = viewModel::setEvent,
    )
}
