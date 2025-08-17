package com.example.mvi_loginapp.ui.feature.login.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.BaseTopAppBar
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginFooter
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginHeader
import com.example.mvi_loginapp.ui.feature.login.composable.components.LoginInputsSection
import com.example.mvi_loginapp.ui.feature.login.contract.LoginEvent
import com.example.mvi_loginapp.ui.feature.login.contract.LoginState

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginState,
    onEventSent: (event: LoginEvent) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        BaseTopAppBar(
            isBackButtonVisible = false,
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
        state = LoginState.DEFAULT,
        onEventSent = {},
    )
}
