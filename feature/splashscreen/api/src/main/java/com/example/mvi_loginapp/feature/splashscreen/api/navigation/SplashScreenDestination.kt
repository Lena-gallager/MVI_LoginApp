package com.example.mvi_loginapp.feature.splashscreen.api.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.core.navigation.NavigationRoutes
import com.example.mvi_loginapp.feature.splashscreen.impl.composable.SplashScreen
import com.example.mvi_loginapp.feature.splashscreen.impl.contract.SplashNavigation
import com.example.mvi_loginapp.feature.splashscreen.impl.viewModel.SplashViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.compose.koinViewModel

@Composable
fun SplashScreenDestination(navController: NavController) {
    val viewModel: SplashViewModel = koinViewModel()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is SplashNavigation.ToLogin -> navController.navigateToLogin()
                is SplashNavigation.ToOnBoarding -> navController.navigateToOnBoarding()
            }
        }.collect()
    }

    SplashScreen()
}

private fun NavController.navigateToLogin() {
    this.navigate(route = NavigationRoutes.LOGIN) {
        popUpTo(0)
    }
}

private fun NavController.navigateToOnBoarding() {
    this.navigate(route = NavigationRoutes.ON_BOARDING) {
        popUpTo(0)
    }
}
