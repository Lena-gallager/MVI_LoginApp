package com.example.mvi_loginapp.feature.onboardingscreen.api.di

import com.example.mvi_loginapp.feature.onboardingscreen.impl.viewModel.OnBoardingViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val OnBoardingModule = module {
    factory { UserInteractionRepository(sharedPreferences = get()) }

    viewModel {
        OnBoardingViewModel(
            userInteractionRepository = get(),
        )
    }
}
