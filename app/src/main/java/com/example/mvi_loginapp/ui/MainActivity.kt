package com.example.mvi_loginapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvi_loginapp.core.uicomponents.theme.AppTheme
import com.example.mvi_loginapp.ui.navigation.AppNavigation

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Surface(
                    color = AppTheme.colors.background,
                ) {
                    AppNavigation()
                }
            }
        }
    }
}