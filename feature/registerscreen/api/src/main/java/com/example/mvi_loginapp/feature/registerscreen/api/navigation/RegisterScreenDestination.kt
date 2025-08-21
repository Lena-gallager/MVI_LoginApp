package com.example.mvi_loginapp.feature.registerscreen.api.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.feature.loginscreen.api.navigation.LoginNavigationRoute
import com.example.mvi_loginapp.feature.registerscreen.impl.composable.RegisterScreen
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterNavigation
import com.example.mvi_loginapp.feature.registerscreen.impl.viewModel.RegisterViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.koin.androidx.compose.koinViewModel

@Composable
fun RegisterScreenDestination(navController: NavController) {
    val viewModel: RegisterViewModel = koinViewModel()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is RegisterNavigation.Back -> navController.popBackStack()
                is RegisterNavigation.ToLoginScreen -> navController.navigateToLogin()
            }
        }.collect()
    }

    RegisterScreen(
        state = viewModel.viewState.value,
        onEventSent = viewModel::setEvent,
    )
}

private fun NavController.navigateToLogin() {
    this.navigate(route = LoginNavigationRoute.ROUTE) {
        launchSingleTop = true
        popUpTo(LoginNavigationRoute.ROUTE)
    }
}
