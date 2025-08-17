package com.example.mvi_loginapp.di

import android.content.SharedPreferences
import com.example.mvi_loginapp.data.AppSharedPreference
import com.example.mvi_loginapp.ui.feature.login.di.LoginModule
import com.example.mvi_loginapp.ui.feature.onBoarding.di.OnBoardingModule
import com.example.mvi_loginapp.ui.feature.register.di.RegisterModule
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
