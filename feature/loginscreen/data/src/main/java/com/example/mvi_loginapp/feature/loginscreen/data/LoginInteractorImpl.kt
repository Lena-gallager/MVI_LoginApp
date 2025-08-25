package com.example.mvi_loginapp.feature.loginscreen.data

import android.content.SharedPreferences
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginInteractor
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginModel
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginResult
import com.example.mvi_loginapp.utils.fromJSON

class LoginInteractorImpl(
    private val sharedPreferences: SharedPreferences,
) : LoginInteractor {

    override suspend fun login(model: LoginModel): LoginResult {
        val user = getUserByEmail(model.email) ?: return LoginResult.Failed.UserNotExists
        if (user.password != model.password) return LoginResult.Failed.WrongPassword

        return LoginResult.Success
    }

    private fun getUserByEmail(email: String): UserData? {
        val usersJson = sharedPreferences.getString(KEY_USERS, "[]") ?: return null
        val users = fromJSON<Array<UserData>>(usersJson)

        return users.find { it.email == email }
    }

    private companion object {
        private const val KEY_USERS = "KEY_USERS"
    }
}
