package com.example.mvi_loginapp.storage.api

import android.content.SharedPreferences

interface AppSharedPreference {

    fun get(): SharedPreferences
}
