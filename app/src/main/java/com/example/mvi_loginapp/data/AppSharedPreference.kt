package com.example.mvi_loginapp.data

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

//todo move to other module
class AppSharedPreference(
    private val application: Application
) {
    private val sharedPreferencesName = "loginapp"

    fun getSharedPreference(): SharedPreferences =
        application.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE)
}
