package com.example.mvi_loginapp.ui.common.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mvi_loginapp.ui.common.defaults.DefaultButtonColors
import com.example.mvi_loginapp.ui.theme.AppTheme

@Composable
fun TextButtonComponent(
    modifier: Modifier = Modifier,
    text: String,
    buttonColors: ButtonColors = DefaultButtonColors.getActionColors(),
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .padding(vertical = 16.dp),
        onClick = onClick,
        colors = buttonColors,
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 8.dp),
            text = text,
            style = AppTheme.typography.titleMedium,
        )
    }
}
