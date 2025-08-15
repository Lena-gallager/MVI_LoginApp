package com.example.mvi_loginapp.ui.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.mvi_loginapp.ui.feature.splash.SplashViewModel
import com.example.mvi_loginapp.ui.navigation.AppNavigation
import com.example.mvi_loginapp.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        splashScreen.setKeepOnScreenCondition{viewModel.isLoading.value}
        setContent {
            AppTheme {
                Surface(
                    color = AppTheme.colors.background,
                ) {
                    //todo mmmmmmmmmmmmmmm
                    AppNavigation(viewModel.startDestination.value)
                }
            }
        }
    }
}
