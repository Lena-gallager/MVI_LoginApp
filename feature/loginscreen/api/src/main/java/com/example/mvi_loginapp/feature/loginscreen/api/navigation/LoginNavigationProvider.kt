package com.example.mvi_loginapp.feature.loginscreen.api.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.mvi_loginapp.core.navigation.NavigationProvider

class LoginNavigationProvider : NavigationProvider {

    override fun registerRoutes(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
    ) {
        navGraphBuilder.composable(
            route = LoginNavigationRoute.ROUTE,
        ) {
            LoginScreenDestination(navController)
        }
    }
}
