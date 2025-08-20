package com.example.mvi_loginapp.core.uicomponents.defaults

import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.mvi_loginapp.ui.theme.AppTheme

object DefaultButtonColors {

    @Composable
    fun getActionColors(): ButtonColors = ButtonColors(
        containerColor = AppTheme.colors.secondarySurface,
        contentColor = AppTheme.colors.onSecondarySurface,
        disabledContentColor = Color.DarkGray,
        disabledContainerColor = Color.White,
    )

    @Composable//todo naming ewh
    fun getNonActionColors(): ButtonColors = ButtonColors(
        containerColor = AppTheme.colors.secondarySurface.copy(
            alpha = 0.5f,
        ),
        contentColor = AppTheme.colors.onSecondarySurface,
        disabledContentColor = Color.DarkGray,
        disabledContainerColor = Color.White,
    )
}
