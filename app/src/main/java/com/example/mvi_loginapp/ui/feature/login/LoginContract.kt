package com.example.mvi_loginapp.ui.feature.login

import com.example.mvi_loginapp.ui.base.ViewEvent
import com.example.mvi_loginapp.ui.base.ViewSideEffect
import com.example.mvi_loginapp.ui.base.ViewState

class LoginContract {

    sealed class Event : ViewEvent {

        data class OnEmailChanged(val newValue: String) : Event()

        data class OnPasswordChanged(val newValue: String) : Event()
    }

    data class State(
        val email: String,
        val password: String,
    ) : ViewState

    sealed class Effect : ViewSideEffect {

        sealed class Navigation : Effect() {

            object OnBackPressed : Navigation()
        }
    }
}
