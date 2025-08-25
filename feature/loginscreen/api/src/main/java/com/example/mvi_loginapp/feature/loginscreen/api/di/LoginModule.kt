package com.example.mvi_loginapp.feature.loginscreen.api.di

import com.example.mvi_loginapp.feature.loginscreen.data.LoginInteractorImpl
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginInteractor
import com.example.mvi_loginapp.feature.loginscreen.impl.viewModel.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val LoginModule = module {
    factory<LoginInteractor> { LoginInteractorImpl(sharedPreferences = get()) }

    viewModel {
        LoginViewModel(interactor = get())
    }
}
