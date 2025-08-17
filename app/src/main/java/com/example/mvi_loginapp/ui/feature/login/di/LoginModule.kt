package com.example.mvi_loginapp.ui.feature.login.di

import com.example.mvi_loginapp.ui.feature.login.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val LoginModule = module {
    viewModel {
        LoginViewModel()
    }
}
