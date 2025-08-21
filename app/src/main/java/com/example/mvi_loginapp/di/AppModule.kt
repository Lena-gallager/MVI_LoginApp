package com.example.mvi_loginapp.di

import android.content.SharedPreferences
import com.example.mvi_loginapp.data.AppSharedPreference
import com.example.mvi_loginapp.feature.loginscreen.api.di.LoginModule
import com.example.mvi_loginapp.feature.onboardingscreen.api.di.OnBoardingModule
import com.example.mvi_loginapp.feature.registerscreen.api.di.RegisterModule
import com.example.mvi_loginapp.ui.feature.splash.di.SplashModule
import org.koin.dsl.module

val AppModule = module {
    single<SharedPreferences> { AppSharedPreference(application = get()).getSharedPreference() }
}

val appModules =listOf(
    AppModule,
    RegisterModule,
    LoginModule,
    OnBoardingModule,
    SplashModule,
)
