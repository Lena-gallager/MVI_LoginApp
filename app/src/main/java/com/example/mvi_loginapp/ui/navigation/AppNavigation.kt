package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Navigation.Routes.LOGIN,
    ) {
        composable(
            route = Navigation.Routes.LOGIN,
        ) {
            LoginScreenDestination(navController)
        }
    }
}

object Navigation {

    object Routes {
        const val LOGIN = "login"
        const val REGISTRATION = "registration"
    }
}
