package com.example.mvi_loginapp.feature.registerscreen.api.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.mvi_loginapp.core.navigation.NavigationProvider
import com.example.mvi_loginapp.core.navigation.NavigationRoutes

class RegisterNavigationProvider : NavigationProvider {

    override fun registerRoutes(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
    ) {
        navGraphBuilder.composable(
            route = NavigationRoutes.REGISTER,
        ) {
            RegisterScreenDestination(navController)
        }
    }
}
