package com.example.mvi_loginapp.feature.onboardingscreen.api.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.feature.loginscreen.api.navigation.LoginNavigationRoute
import com.example.mvi_loginapp.feature.onboardingscreen.impl.composable.OnBoardingScreen
import com.example.mvi_loginapp.feature.onboardingscreen.impl.contract.OnBoardingNavigation
import com.example.mvi_loginapp.feature.onboardingscreen.impl.data.OnBoardingStates
import com.example.mvi_loginapp.feature.onboardingscreen.impl.viewModel.OnBoardingViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.compose.koinViewModel

@Composable
internal fun OnBoardingScreenDestination(navController: NavController) {

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
    navigate(route = LoginNavigationRoute.ROUTE) {
        popUpTo(OnBoardingNavigationRoute.ROUTE) { inclusive = true }
    }
}
