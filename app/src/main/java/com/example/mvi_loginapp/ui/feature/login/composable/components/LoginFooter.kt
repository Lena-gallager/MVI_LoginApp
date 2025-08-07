package com.example.mvi_loginapp.ui.feature.login.composable.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.components.LoginSocialMediaSection
import com.example.mvi_loginapp.ui.common.components.TextButtonComponent
import com.example.mvi_loginapp.ui.feature.login.contract.LoginEvent
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun LoginFooter(
    modifier: Modifier = Modifier,
    onEventSent: (event: LoginEvent) -> Unit,
) {
    Column(
        modifier = modifier
            .navigationBarsPadding()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextButtonComponent(
            text = "Login",
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
                text = "Don't have an account?",
                color = AppTheme.colors.onBackground,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                modifier = Modifier
                    .clickable(onClick = { onEventSent(LoginEvent.OnRegisterClicked) }),
                text = "Sign-up",
                color = AppTheme.colors.onActionSurface,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview
@Composable
private fun LoginFooterPreview() {
    LoginFooter(
        onEventSent = {}
    )
}
