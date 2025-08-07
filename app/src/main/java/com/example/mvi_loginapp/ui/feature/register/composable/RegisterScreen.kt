package com.example.mvi_loginapp.ui.feature.register.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.TopAppBar
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterFooter
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterHeader
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterInputsSection
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterEvent
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterState

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    state: RegisterState,
    onEventSent: (event: RegisterEvent) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        TopAppBar(
            onBackClicked = { onEventSent(RegisterEvent.OnBackPressed) },
        )
        RegisterHeader()
        Spacer(modifier = Modifier.height(40.dp))
        RegisterInputsSection(
            modifier = Modifier.weight(1f),
            state = state,
            onEventSent = onEventSent,
        )
        RegisterFooter(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 16.dp),
            onEventSent = onEventSent,
        )
    }
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen(
        state = RegisterState.DEFAULT,
        onEventSent = {},
    )
}
