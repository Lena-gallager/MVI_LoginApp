package com.example.mvi_loginapp.feature.loginscreen.impl.composable.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.core.uicomponents.components.text.ClickableText
import com.example.mvi_loginapp.core.uicomponents.components.textField.BaseTextField
import com.example.mvi_loginapp.core.uicomponents.components.textField.PasswordTextField
import com.example.mvi_loginapp.core.uicomponents.icons.common.CommonIconPack
import com.example.mvi_loginapp.core.uicomponents.icons.common.IcEmail
import com.example.mvi_loginapp.core.uicomponents.icons.common.IcPassword
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginEvent
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginState

@Composable
internal fun LoginInputsSection(
    modifier: Modifier = Modifier,
    state: LoginState,
    onEventSent: (event: LoginEvent) -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        BaseTextField(
            value = state.email,
            onValueChange = { onEventSent(LoginEvent.OnEmailChanged(it)) },
            labelText = "Enter your email",
            leadingIconVector = CommonIconPack.IcEmail,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(
            value = state.password,
            onValueChange = { onEventSent(LoginEvent.OnPasswordChanged(it)) },
            labelText = "Enter your password",
            leadingIconVector = CommonIconPack.IcPassword,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopEnd,
        ) {
            ClickableText(
                text = "Forgot password?",
                style = AppTheme.typography.titleSmall,
                onClick = { onEventSent(LoginEvent.OnForgotPasswordCLicked) },
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LoginInputsSectionPreview() {
    LoginInputsSection(
        state = LoginState.DEFAULT,
        onEventSent = {},
    )
}
