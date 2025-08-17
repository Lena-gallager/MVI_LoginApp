package com.example.mvi_loginapp.ui.feature.login.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.login.LoginViewModel
import com.example.mvi_loginapp.ui.feature.login.composable.LoginScreen
import com.example.mvi_loginapp.ui.feature.login.contract.LoginNavigation
import com.example.mvi_loginapp.ui.navigation.navigateToRegistration
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach

@Composable
fun LoginScreenDestination(navController: NavController) {
    val viewModel: LoginViewModel = viewModel<LoginViewModel>()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is LoginNavigation.ToRegistrationScreen -> {
                    navController.navigateToRegistration()
                }
            }
        }.collect()
    }

    LoginScreen(
        state = viewModel.viewState.value,
        onEventSent = viewModel::setEvent,
    )
}
