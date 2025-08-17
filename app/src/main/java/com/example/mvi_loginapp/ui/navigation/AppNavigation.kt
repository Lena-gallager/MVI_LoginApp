package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvi_loginapp.ui.feature.login.navigation.LoginScreenDestination
import com.example.mvi_loginapp.ui.feature.onBoarding.navigation.OnBoardingScreenDestination
import com.example.mvi_loginapp.ui.feature.register.navigation.RegisterScreenDestination

@Composable
fun AppNavigation(
    startDestination: String,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        //todo separate (what we'll be doing when there are hundreds of screens)
        composable(
            route = Navigation.Routes.ON_BOARDING,
        ) {
            OnBoardingScreenDestination(navController)
        }
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

//todo separate
object Navigation {

    object Routes {
        const val LOGIN = "login"
        const val REGISTRATION = "registration"
        const val ON_BOARDING = "on_boarding"
    }
}
