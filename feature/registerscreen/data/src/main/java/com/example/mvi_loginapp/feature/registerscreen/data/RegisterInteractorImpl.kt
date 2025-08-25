package com.example.mvi_loginapp.feature.registerscreen.data

import android.content.SharedPreferences
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterInteractor
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterModel
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterResult
import com.example.mvi_loginapp.utils.fromJSON
import com.example.mvi_loginapp.utils.toJSON
import androidx.core.content.edit

class RegisterInteractorImpl(
    private val sharedPreferences: SharedPreferences,
) : RegisterInteractor {

    override suspend fun register(model: RegisterModel): RegisterResult = when {
        !isPasswordValid(model) -> RegisterResult.Failed.PasswordsNotMatch
        !isUserUnique(model) -> RegisterResult.Failed.UserAlreadyExists
        else -> {
            saveUser(email = model.email, password = model.password)
            RegisterResult.Success
        }
    }

    private fun getUserByEmail(email: String): UserData? {
        val usersJson = sharedPreferences.getString(KEY_USERS, null) ?: return null
        val users = fromJSON<Array<UserData>>(usersJson)

        return users.find { it.email == email }
    }

    private fun saveUser(email: String, password: String) {
        val userData = UserData(email = email, password = password)
        val usersJson = sharedPreferences.getString(KEY_USERS, null)
        //todo упростить
        val users = if (usersJson == null) mutableListOf() else fromJSON<Array<UserData>>(sharedPreferences.getString(KEY_USERS, null)!!).toMutableList()
        users.add(userData)
        sharedPreferences.edit { putString(KEY_USERS, users.toJSON()) }
    }

    private fun isUserUnique(model: RegisterModel): Boolean {
        val user = getUserByEmail(model.email)

        return user == null
    }

    private fun isPasswordValid(model: RegisterModel): Boolean {
        return model.password == model.confirmPassword
    }

    private companion object {
        private const val KEY_USERS = "KEY_USERS"
    }
}
