package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.mvi_loginapp.core.navigation.NavigationRoutes
import com.example.mvi_loginapp.feature.loginscreen.api.navigation.LoginNavigationProvider
import com.example.mvi_loginapp.feature.onboardingscreen.api.navigation.OnBoardingNavigationProvider
import com.example.mvi_loginapp.feature.registerscreen.api.navigation.RegisterNavigationProvider
import com.example.mvi_loginapp.feature.splashscreen.api.navigation.SplashNavigationProvider

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navigationProviders = listOf(
        SplashNavigationProvider(),
        OnBoardingNavigationProvider(),
        LoginNavigationProvider(),
        RegisterNavigationProvider(),
    )

    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.SPLASH,
    ) {
        navigationProviders.forEach {
            it.registerRoutes(navController = navController, navGraphBuilder = this)
        }
    }
}
