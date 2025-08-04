package com.example.mvi_loginapp.ui.feature.login.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.TopAppBar
import com.example.mvi_loginapp.ui.feature.login.LoginContract
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginFooter
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginHeader
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginInputsSection
import kotlinx.coroutines.flow.Flow

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginContract.State,
    effectFlow: Flow<LoginContract.Effect>?,
    onEventSent: (event: LoginContract.Event) -> Unit,
    onNavigationRequested: (navigationEffect: LoginContract.Effect.Navigation) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        TopAppBar(
            modifier = Modifier.statusBarsPadding(),
            onBackClicked = {},
        )
        LoginHeader()
        Spacer(modifier = Modifier.height(40.dp))
        LoginInputsSection(
            modifier = Modifier.weight(1f),
            emailValue = state.email,
            passwordValue = state.password,
            onEmailChange = { onEventSent(LoginContract.Event.OnEmailChanged(it)) },
            onPasswordChange = { onEventSent(LoginContract.Event.OnPasswordChanged(it)) },
            onForgotPasswordClicked = {},
        )
        LoginFooter(
            modifier = Modifier
                .weight(1f)
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen(
        state = LoginContract.State(
            email = "",
            password = "",
        ),
        effectFlow = null,
        onEventSent = {},
        onNavigationRequested = {},
    )
}
