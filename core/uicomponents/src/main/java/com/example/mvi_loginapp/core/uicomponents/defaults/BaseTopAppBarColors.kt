package com.example.mvi_loginapp.core.uicomponents.defaults

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
object BaseTopAppBarColors {

    @Composable
    fun get(): TopAppBarColors = TopAppBarDefaults.topAppBarColors().copy(
        containerColor = AppTheme.colors.background,
    )
}
