package com.example.mvi_loginapp.feature.loginscreen.api.di

import com.example.mvi_loginapp.feature.loginscreen.impl.viewModel.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val LoginModule = module {
    viewModel {
        LoginViewModel()
    }
}
