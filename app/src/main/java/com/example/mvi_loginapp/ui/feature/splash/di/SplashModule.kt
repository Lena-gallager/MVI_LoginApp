package com.example.mvi_loginapp.ui.feature.splash.di

import com.example.mvi_loginapp.data.UserInteractionRepository
import com.example.mvi_loginapp.ui.feature.splash.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val SplashModule = module {
    factory { UserInteractionRepository(sharedPreferences = get()) }

    viewModel {
        SplashViewModel(
            userInteractionRepository = get(),
        )
    }
}
