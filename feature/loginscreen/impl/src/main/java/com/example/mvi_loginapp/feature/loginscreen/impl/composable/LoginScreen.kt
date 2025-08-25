package com.example.mvi_loginapp.feature.loginscreen.impl.composable

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
import com.example.mvi_loginapp.feature.loginscreen.impl.composable.components.LoginFooter
import com.example.mvi_loginapp.feature.loginscreen.impl.composable.components.LoginHeader
import com.example.mvi_loginapp.feature.loginscreen.impl.composable.components.LoginInputsSection
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginEvent
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginState
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginDialogType
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginErrorType

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    state: LoginState,
    onEventSent: (event: LoginEvent) -> Unit,
) {
    val context = LocalContext.current
    val socialMediaDialog: LoginDialogType.SocialMedia? = state.dialogType as? LoginDialogType.SocialMedia
    val passwordChangeDialog: LoginDialogType.PasswordChange? = state.dialogType as? LoginDialogType.PasswordChange
    val error: LoginErrorType? = state.errorType

    LaunchedEffect(error) {
        if (error != null) {
            val text = when (error) {
                is LoginErrorType.UserNotExists -> "OOooops, user with this login not found"
                is LoginErrorType.WrongPassword -> "Password (${state.password}) is wrong. Correct password: im kidden i wont show u the correct password"
            }
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
            onEventSent(LoginEvent.ResetError)
        }
    }

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
            email = state.email,
            password = state.password,
            onEventSent = onEventSent,
        )
        LoginFooter(
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
            onConfirmClick = { onEventSent(LoginEvent.OnDismissDialog) },
            onDismiss = { onEventSent(LoginEvent.OnDismissDialog) },
        )
    }

    if (passwordChangeDialog != null) {
        DialogOneButton(
            title = "Твой пароль - твои проблемы",
            description = "Пароли нужно сохранять и записывать куда-то, а не тыкать на каждый чих \"я забыл пароль, помогите\"",
            buttonText = "Принял, зря быканул",
            onConfirmClick = { onEventSent(LoginEvent.OnDismissDialog) },
            onDismiss = { onEventSent(LoginEvent.OnDismissDialog) },
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
