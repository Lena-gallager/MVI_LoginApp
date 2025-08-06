package com.example.mvi_loginapp.ui.feature.register.composable.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun RegisterHeader(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = "Let's Create\nAccount",
            style = AppTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AppTheme.colors.onBackground,
        )
    }
}

@Preview
@Composable
private fun RegisterHeaderPreview() {
    RegisterHeader()
}
