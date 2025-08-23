package com.example.mvi_loginapp.storage.api

import android.content.SharedPreferences

//todo not used because see com.example.mvi_loginapp.data.AppSharedPreference
interface AppSharedPreference {

    fun get(): SharedPreferences
}
