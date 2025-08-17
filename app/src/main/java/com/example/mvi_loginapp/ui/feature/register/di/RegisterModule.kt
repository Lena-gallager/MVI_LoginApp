package com.example.mvi_loginapp.ui.feature.register.di

import com.example.mvi_loginapp.ui.feature.register.RegisterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val RegisterModule = module {
    viewModel {
        RegisterViewModel()
    }
}
