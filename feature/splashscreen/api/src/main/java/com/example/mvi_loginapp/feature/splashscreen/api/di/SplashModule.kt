package com.example.mvi_loginapp.feature.splashscreen.api.di

import com.example.mvi_loginapp.feature.onboardingscreen.data.OnBoardingRepository
import com.example.mvi_loginapp.feature.splashscreen.impl.viewModel.SplashViewModel
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
