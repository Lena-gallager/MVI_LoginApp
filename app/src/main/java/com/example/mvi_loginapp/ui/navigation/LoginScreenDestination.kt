package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.login.LoginViewModel
import com.example.mvi_loginapp.ui.feature.login.composable.LoginScreen

@Composable
fun LoginScreenDestination(navController: NavController) {
    val viewModel: LoginViewModel = viewModel<LoginViewModel>()

    LoginScreen(
        state = viewModel.viewState.value,
        effectFlow = viewModel.effect,
        onEventSent = { event -> viewModel.setEvent(event) },
        onNavigationRequested = { navigationEffect -> },
    )
}
