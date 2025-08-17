package com.example.mvi_loginapp.ui.feature.register.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.register.RegisterViewModel
import com.example.mvi_loginapp.ui.feature.register.composable.RegisterScreen
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterNavigation
import com.example.mvi_loginapp.ui.navigation.Navigation
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
    this.navigate(route = Navigation.Routes.LOGIN) {
        launchSingleTop = true
        popUpTo(Navigation.Routes.LOGIN)
    }
}
