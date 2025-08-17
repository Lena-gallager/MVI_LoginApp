package com.example.mvi_loginapp.ui.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvi_loginapp.ui.feature.splash.SplashViewModel
import com.example.mvi_loginapp.ui.navigation.AppNavigation
import com.example.mvi_loginapp.ui.theme.AppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: SplashViewModel = koinViewModel()
            splashScreen.setKeepOnScreenCondition { viewModel.isLoading.value }

            AppTheme {
                Surface(
                    color = AppTheme.colors.background,
                ) {
                    AppNavigation(viewModel.startDestination.value)
                }
            }
        }
    }
}
