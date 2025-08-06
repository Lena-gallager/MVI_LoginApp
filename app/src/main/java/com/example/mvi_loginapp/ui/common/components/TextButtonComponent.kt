package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun TextButtonComponent(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        onClick = onClick,
        colors = ButtonColors(
            containerColor = AppTheme.colors.secondarySurface,
            contentColor = AppTheme.colors.onSecondarySurface,
            disabledContentColor = Color.DarkGray,
            disabledContainerColor = Color.White,
        )
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 8.dp),
            text = text,
            style = AppTheme.typography.titleMedium,
        )
    }
}
