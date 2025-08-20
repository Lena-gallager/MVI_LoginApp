package com.example.mvi_loginapp.feature.loginscreen.impl.destination

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.mvi_loginapp.feature.loginscreen.impl.composable.LoginScreen
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginNavigation
import com.example.mvi_loginapp.feature.loginscreen.impl.viewModel.LoginViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreenDestination(navController: NavController) {
    val viewModel: LoginViewModel = koinViewModel()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is LoginNavigation.ToRegistrationScreen -> navController.navigateToRegistration()
            }
        }.collect()
    }

    LoginScreen(
        state = viewModel.viewState.value,
        onEventSent = viewModel::setEvent,
    )
}

private fun NavController.navigateToRegistration() {
   // navigate(route = Navigation.Routes.REGISTRATION)
}
