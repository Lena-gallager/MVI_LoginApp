package com.example.mvi_loginapp.ui.feature.onBoarding.di

import com.example.mvi_loginapp.data.UserInteractionRepository
import org.koin.core.module.dsl.viewModel
import com.example.mvi_loginapp.ui.feature.onBoarding.OnBoardingViewModel
import org.koin.dsl.module

val OnBoardingModule = module {
    factory { UserInteractionRepository(sharedPreferences = get()) }

    viewModel {
        OnBoardingViewModel(
            userInteractionRepository = get(),
        )
    }
}
