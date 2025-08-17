package com.example.mvi_loginapp.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class AppSharedPreference(
    private val application: Application
) {
    private val sharedPreferencesName = "loginapp"

    fun getSharedPreference(): SharedPreferences =
        application.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)
}
