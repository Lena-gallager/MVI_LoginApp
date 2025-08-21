package com.example.mvi_loginapp.storage.impl

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.mvi_loginapp.storage.api.AppSharedPreference

class AppSharedPreferenceImpl(
    private val application: Application,
) : AppSharedPreference {

    override fun get(): SharedPreferences =
        application.getSharedPreferences(NAME, Context.MODE_PRIVATE)

    private companion object {

        const val NAME = "MVI_LOGIN_APP"
    }
}
