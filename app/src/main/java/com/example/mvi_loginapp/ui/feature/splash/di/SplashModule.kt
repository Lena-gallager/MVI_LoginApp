package com.example.mvi_loginapp.ui.feature.splash.di

import com.example.mvi_loginapp.feature.onboardingscreen.api.repository.OnBoardingRepository
import com.example.mvi_loginapp.ui.feature.splash.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val SplashModule = module {
    factory { OnBoardingRepository(sharedPreferences = get()) }

    viewModel {
        SplashViewModel(
            onBoardingRepository = get(),
        )
    }
}
