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
import com.example.mvi_loginapp.ui.feature.register.RegisterContract
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterFooter
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterHeader
import com.example.mvi_loginapp.ui.feature.register.composable.components.RegisterInputsSection
import kotlinx.coroutines.flow.Flow

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    state: RegisterContract.State,
    effectFlow: Flow<RegisterContract.Effect>?,
    onEventSent: (event: RegisterContract.Event) -> Unit,
    onNavigationRequested: (navigationEffect: RegisterContract.Effect.Navigation) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        TopAppBar(
            onBackClicked = {},
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
        )
    }
}

@Preview
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen(
        state = RegisterContract.State.DEFAULT,
        effectFlow = null,
        onEventSent = {},
        onNavigationRequested = {},
    )
}
