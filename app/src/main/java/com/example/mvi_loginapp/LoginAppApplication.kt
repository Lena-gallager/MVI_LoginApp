package com.example.mvi_loginapp

import android.app.Application
import com.example.mvi_loginapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class LoginAppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@LoginAppApplication)
            modules(appModules)
        }
    }
}
