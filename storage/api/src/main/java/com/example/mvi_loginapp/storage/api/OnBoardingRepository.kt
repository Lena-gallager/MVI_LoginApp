package com.example.mvi_loginapp.storage.api

import android.content.SharedPreferences
import androidx.core.content.edit

class OnBoardingRepository(
    private val sharedPreferences: SharedPreferences,
) {

    var isOnBoardingWasPerformed: Boolean
        get() = sharedPreferences.getBoolean(IS_ON_BOARDING_WAS_PERFORMED, false)
        set(value) {
            sharedPreferences.edit { putBoolean(IS_ON_BOARDING_WAS_PERFORMED, value) }
        }

    private companion object {
        const val IS_ON_BOARDING_WAS_PERFORMED = "IS_ON_BOARDING_WAS_PERFORMED"
    }
}