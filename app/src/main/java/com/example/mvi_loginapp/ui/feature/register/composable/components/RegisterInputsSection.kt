package com.example.mvi_loginapp.ui.feature.register.composable.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.PasswordTextField
import com.example.mvi_loginapp.ui.common.components.BaseTextField
import com.example.mvi_loginapp.ui.common.icons.common.CommonIconPack
import com.example.mvi_loginapp.ui.common.icons.common.IcEmail
import com.example.mvi_loginapp.ui.common.icons.common.IcPassword
import com.example.mvi_loginapp.ui.common.icons.common.IcPhoneNumber
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterEvent
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterState

@Composable
fun RegisterInputsSection(
    modifier: Modifier = Modifier,
    state: RegisterState,
    onEventSent: (event: RegisterEvent) -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        BaseTextField(
            value = state.email,
            onValueChange = { onEventSent(RegisterEvent.OnEmailChanged(it)) },
            labelText = "Enter your email",
            leadingIconVector = CommonIconPack.IcEmail,
        )
        Spacer(modifier = Modifier.height(16.dp))
        BaseTextField(
            value = state.phone,
            onValueChange = { onEventSent(RegisterEvent.OnPhoneChanged(it)) },
            labelText = "Enter your number",
            leadingIconVector = CommonIconPack.IcPhoneNumber,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(
            value = state.password,
            onValueChange = { onEventSent(RegisterEvent.OnPasswordChanged(it)) },
            labelText = "Enter your password",
            leadingIconVector = CommonIconPack.IcPassword,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(
            value = state.confirmPassword,
            onValueChange = { onEventSent(RegisterEvent.OnConfirmPasswordChanged(it)) },
            labelText = "Confirm your password",
            leadingIconVector = CommonIconPack.IcPassword,
        )
    }
}

@Preview
@Composable
private fun RegisterInputsSectionPreview() {
    RegisterInputsSection(
        state = RegisterState.DEFAULT,
        onEventSent = {},
    )
}
