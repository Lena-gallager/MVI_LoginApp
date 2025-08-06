package com.example.mvi_loginapp.ui.feature.login.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.base.SIDE_EFFECTS_KEY
import com.example.mvi_loginapp.ui.common.components.TopAppBar
import com.example.mvi_loginapp.ui.feature.login.LoginContract
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginFooter
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginHeader
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginInputsSection
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginContract.State,
    effectFlow: Flow<LoginContract.Effect>?,
    onEventSent: (event: LoginContract.Event) -> Unit,
    onNavigationRequested: (navigationEffect: LoginContract.Effect.Navigation) -> Unit,
) {
    LaunchedEffect(SIDE_EFFECTS_KEY) {
        effectFlow?.onEach { effect ->
            when (effect) {
                is LoginContract.Effect.Navigation.ToRegistration -> {
                    onNavigationRequested(LoginContract.Effect.Navigation.ToRegistration)
                }
                is LoginContract.Effect.Navigation.OnBackPressed -> {
                    onNavigationRequested(LoginContract.Effect.Navigation.OnBackPressed)
                }
            }
        }?.collect()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        TopAppBar(
            onBackClicked = {},
        )
        LoginHeader()
        Spacer(modifier = Modifier.height(40.dp))
        LoginInputsSection(
            modifier = Modifier.weight(1f),
            state = state,
            onEventSent = onEventSent,
        )
        LoginFooter(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 16.dp),
            onEventSent = onEventSent,
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginContract.State.DEFAULT,
        effectFlow = null,
        onEventSent = {},
        onNavigationRequested = {},
    )
}
