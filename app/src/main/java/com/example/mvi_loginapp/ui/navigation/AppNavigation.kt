package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvi_loginapp.ui.feature.login.navigation.LoginScreenDestination
import com.example.mvi_loginapp.ui.feature.register.navigation.RegisterScreenDestination

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
        composable(
            route = Navigation.Routes.REGISTRATION,
        ) {
            RegisterScreenDestination(navController)
        }
    }
}

object Navigation {

    object Routes {
        const val LOGIN = "login"
        const val REGISTRATION = "registration"
    }
}

fun NavController.navigateToRegistration() {
    navigate(route = Navigation.Routes.REGISTRATION)
}

fun NavController.navigateToLogin() {
    navigate(route = Navigation.Routes.LOGIN)
}
