package com.example.mvi_loginapp.ui.feature.register.composable.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.MyIconPack
import com.example.mvi_loginapp.ui.common.components.PasswordTextField
import com.example.mvi_loginapp.ui.common.components.BaseTextField
import com.example.mvi_loginapp.ui.common.myiconpack.IcEmail
import com.example.mvi_loginapp.ui.common.myiconpack.IcPassword
import com.example.mvi_loginapp.ui.common.myiconpack.IcPhoneNumber
import com.example.mvi_loginapp.ui.feature.register.RegisterContract

@Composable
fun RegisterInputsSection(
    modifier: Modifier = Modifier,
    state: RegisterContract.State,
    onEventSent: (event: RegisterContract.Event) -> Unit,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        BaseTextField(
            value = state.email,
            onValueChange = { onEventSent(RegisterContract.Event.OnEmailChanged(it)) },
            labelText = "Enter your email",
            leadingIconVector = MyIconPack.IcEmail,
        )
        Spacer(modifier = Modifier.height(16.dp))
        BaseTextField(
            value = state.phone,
            onValueChange = { onEventSent(RegisterContract.Event.OnPhoneChanged(it)) },
            labelText = "Enter your number",
            leadingIconVector = MyIconPack.IcPhoneNumber,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(
            value = state.password,
            onValueChange = { onEventSent(RegisterContract.Event.OnPasswordChanged(it)) },
            labelText = "Enter your password",
            leadingIconVector = MyIconPack.IcPassword,
        )
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(
            value = state.confirmPassword,
            onValueChange = { onEventSent(RegisterContract.Event.OnConfirmPasswordChanged(it)) },
            labelText = "Confirm your password",
            leadingIconVector = MyIconPack.IcPassword,
        )
    }
}

@Preview
@Composable
private fun RegisterInputsSectionPreview() {
    RegisterInputsSection(
        state = RegisterContract.State.DEFAULT,
        onEventSent = {},
    )
}
