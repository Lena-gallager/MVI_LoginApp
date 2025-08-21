package com.example.mvi_loginapp.feature.registerscreen.api.di

import com.example.mvi_loginapp.feature.registerscreen.impl.viewModel.RegisterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val RegisterModule = module {
    viewModel {
        RegisterViewModel()
    }
}
