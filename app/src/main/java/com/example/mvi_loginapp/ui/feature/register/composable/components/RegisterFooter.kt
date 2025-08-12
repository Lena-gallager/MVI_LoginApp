package com.example.mvi_loginapp.ui.feature.register.composable.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.ClickableText
import com.example.mvi_loginapp.ui.common.components.LoginSocialMediaSection
import com.example.mvi_loginapp.ui.common.components.TextButtonComponent
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterEvent
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun RegisterFooter(
    modifier: Modifier = Modifier,
    onEventSent: (event: RegisterEvent) -> Unit,
) {
    Column(
        modifier = modifier
            .navigationBarsPadding()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextButtonComponent(
            text = "Create Account",
            onClick = {},
        )
        Text(
            text = "Or Continue with",
            style = AppTheme.typography.label,
            textAlign = TextAlign.Center,
            color = AppTheme.colors.onBackground,
        )
        LoginSocialMediaSection()
        Row {
            Text(
                modifier = Modifier
                    .padding(4.dp),
                text = "Already have an Account?",
                color = AppTheme.colors.onBackground,
                style = AppTheme.typography.titleMedium,
            )
            ClickableText(
                text = "Sign-in",
                style = AppTheme.typography.titleMedium,
                onClick = { onEventSent(RegisterEvent.LoginClicked) },
            )
        }
    }
}

@Preview
@Composable
private fun RegisterFooterPreview() {
    RegisterFooter(
        onEventSent = {},
    )
}
