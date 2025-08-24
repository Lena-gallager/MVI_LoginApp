package com.example.mvi_loginapp.feature.registerscreen.impl.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

//todo there is no remember's and there is no need in them
// (when u write one letter to TextField then all screen recompose one time (remember's dont save from this)
// i dont think that we need to fix one recomposition of all screen when user inputs smth to TextField cause UI now is really smooth (at API 36 lol))
//todo check UI at API 23
@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    state: RegisterState,
    onEventSent: (event: RegisterEvent) -> Unit,
) {
    val socialMediaDialog: RegisterDialogType.SocialMedia? = state.dialogType as? RegisterDialogType.SocialMedia

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
