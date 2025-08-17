package com.example.mvi_loginapp.ui.feature.onBoarding.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.onBoarding.OnBoardingViewModel
import com.example.mvi_loginapp.ui.feature.onBoarding.composable.OnBoardingScreen
import com.example.mvi_loginapp.ui.feature.onBoarding.contract.OnBoardingNavigation
import com.example.mvi_loginapp.ui.feature.onBoarding.data.OnBoardingStates
import com.example.mvi_loginapp.ui.navigation.Navigation
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.compose.koinViewModel

@Composable
fun OnBoardingScreenDestination(navController: NavController) {

    val viewModel: OnBoardingViewModel = koinViewModel()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is OnBoardingNavigation.ToLogin -> navController.navigateToLogin()
            }
        }.collect()
    }

    OnBoardingScreen(
        states = OnBoardingStates,
        onEventSent = viewModel::setEvent,
    )
}

private fun NavController.navigateToLogin() {
    navigate(route = Navigation.Routes.LOGIN) {
        popUpTo(Navigation.Routes.ON_BOARDING) { inclusive = true }
    }
}
