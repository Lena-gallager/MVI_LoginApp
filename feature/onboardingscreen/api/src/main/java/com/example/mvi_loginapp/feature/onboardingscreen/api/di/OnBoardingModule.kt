package com.example.mvi_loginapp.feature.onboardingscreen.api.di

import com.example.mvi_loginapp.feature.onboardingscreen.impl.viewModel.OnBoardingViewModel
import com.example.mvi_loginapp.storage.api.OnBoardingRepository
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val OnBoardingModule = module {
    factory { OnBoardingRepository(sharedPreferences = get()) }

    viewModel {
        OnBoardingViewModel(
            onBoardingRepository = get(),
        )
    }
}
