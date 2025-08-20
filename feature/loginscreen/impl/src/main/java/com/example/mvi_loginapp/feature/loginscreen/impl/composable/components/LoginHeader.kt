package com.example.mvi_loginapp.feature.loginscreen.impl.composable.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

@Composable
fun LoginHeader(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = "Hey,\nWelcome Back",
            style = AppTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AppTheme.colors.onBackground,
        )
    }
}

@Preview
@Composable
private fun LoginHeaderPreview() {
    LoginHeader()
}
