package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.mvi_loginapp.feature.loginscreen.api.navigation.LoginNavigationProvider
import com.example.mvi_loginapp.feature.onboardingscreen.api.navigation.OnBoardingNavigationProvider
import com.example.mvi_loginapp.feature.registerscreen.api.navigation.RegisterNavigationProvider

@Composable
fun AppNavigation(
    startDestination: String,
) {
    val navController = rememberNavController()
    val navigationProviders = listOf(
        OnBoardingNavigationProvider(),
        LoginNavigationProvider(),
        RegisterNavigationProvider(),
    )

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        navigationProviders.forEach {
            it.registerRoutes(navController = navController, navGraphBuilder = this)
        }
    }
}
