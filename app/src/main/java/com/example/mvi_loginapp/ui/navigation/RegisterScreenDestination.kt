package com.example.mvi_loginapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.mvi_loginapp.ui.feature.register.RegisterContract
import com.example.mvi_loginapp.ui.feature.register.RegisterViewModel
import com.example.mvi_loginapp.ui.feature.register.composable.RegisterScreen

@Composable
fun RegisterScreenDestination(navController: NavController) {
    val viewModel: RegisterViewModel = viewModel<RegisterViewModel>()

    RegisterScreen(
        state = viewModel.viewState.value,
        effectFlow = viewModel.effect,
        onEventSent = { event -> viewModel.setEvent(event) },
        onNavigationRequested = { navigationEffect ->
            when (navigationEffect) {
                is RegisterContract.Effect.Navigation.OnBackPressed -> {
                    navController.popBackStack()
                }
                is RegisterContract.Effect.Navigation.ToLogin -> {

                }
            }
        },
    )
}
