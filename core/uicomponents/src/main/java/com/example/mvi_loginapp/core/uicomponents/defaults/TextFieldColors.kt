package com.example.mvi_loginapp.core.uicomponents.defaults

import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

object TextFieldColors {

    @Composable
    fun get(): TextFieldColors = TextFieldDefaults.colors(
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        cursorColor = AppTheme.colors.onActionSurface,
        focusedLabelColor = AppTheme.colors.onActionSurface,
        focusedContainerColor = AppTheme.colors.actionSurface,
        unfocusedContainerColor = AppTheme.colors.actionSurface,
    )
}
