package com.example.mvi_loginapp.feature.registerscreen.impl.composable

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.core.uicomponents.components.appBar.BaseTopAppBar
import com.example.mvi_loginapp.core.uicomponents.components.dialog.DialogOneButton
import com.example.mvi_loginapp.feature.registerscreen.impl.composable.components.RegisterFooter
import com.example.mvi_loginapp.feature.registerscreen.impl.composable.components.RegisterHeader
import com.example.mvi_loginapp.feature.registerscreen.impl.composable.components.RegisterInputsSection
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterEvent
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterState
import com.example.mvi_loginapp.feature.registerscreen.impl.data.RegisterDialogType
import com.example.mvi_loginapp.feature.registerscreen.impl.data.RegisterErrorType

@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    state: RegisterState,
    onEventSent: (event: RegisterEvent) -> Unit,
) {
    val context = LocalContext.current
    val socialMediaDialog: RegisterDialogType.SocialMedia? = state.dialogType as? RegisterDialogType.SocialMedia
    val error: RegisterErrorType? = state.errorType

    LaunchedEffect(error) {
        if (error != null) {
            val text = when (error) {
                is RegisterErrorType.UserAlreadyExists -> "OOooops, user with this login already exists"
                is RegisterErrorType.PasswordsNotMatch -> "Dude u couldnt even input two identical passwords"
            }
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
            onEventSent(RegisterEvent.ResetError)
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        BaseTopAppBar(
            onBackClicked = { onEventSent(RegisterEvent.OnBackPressed) },
        )
        RegisterHeader()
        Spacer(modifier = Modifier.height(40.dp))
        RegisterInputsSection(
            modifier = Modifier.weight(1f),
            //todo maybe better to create RegisterInputData that will contain email, phone, etc. but idk im not sure
            email = state.email,
            phone = state.phone,
            password = state.password,
            confirmPassword = state.confirmPassword,
            onEventSent = onEventSent,
        )
        RegisterFooter(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 16.dp),
            onEventSent = onEventSent,
        )
    }

    if (socialMediaDialog != null) {
        DialogOneButton(
            title = "Хочешь сказать, что у тебя есть ${socialMediaDialog.type} аккаунт?",
            description = "Ты давай пендоские сервисы переставай использовать. Лучше зарегистрируйся в MAX!",
            buttonText = "Извините, пошел регистрироваться в Максе",
            onConfirmClick = { onEventSent(RegisterEvent.OnDismissDialog) },
            onDismiss = { onEventSent(RegisterEvent.OnDismissDialog) },
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
