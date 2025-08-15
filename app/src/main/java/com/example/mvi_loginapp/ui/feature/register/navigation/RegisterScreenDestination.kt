package com.example.mvi_loginapp.ui.feature.register.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.register.RegisterViewModel
import com.example.mvi_loginapp.ui.feature.register.composable.RegisterScreen
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterNavigation
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach

@Composable
fun RegisterScreenDestination(navController: NavController) {
    val viewModel: RegisterViewModel = viewModel<RegisterViewModel>()

    LaunchedEffect(Unit) {
        viewModel.navigation.onEach { navigation ->
            when (navigation) {
                is RegisterNavigation.Back -> {
                    navController.popBackStack()
                }

                //todo i have no fucking idea how just not to add screen to backStack (its about this LoginScreen and OnBoarding)
                // that was sooooooooo simple in jectpack navigation where we have VISIBLE GRAPH (i miss it)
                is RegisterNavigation.ToLoginScreen -> {
                    navController.popBackStack()
                }
            }
        }.collect()
    }

    RegisterScreen(
        state = viewModel.viewState.value,
        onEventSent = viewModel::setEvent,
    )
}
