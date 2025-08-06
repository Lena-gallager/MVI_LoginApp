package com.example.mvi_loginapp.ui.feature.register

import com.example.mvi_loginapp.ui.base.ViewEvent
import com.example.mvi_loginapp.ui.base.ViewSideEffect
import com.example.mvi_loginapp.ui.base.ViewState

class RegisterContract {

    sealed class Event : ViewEvent {

        data class OnEmailChanged(val newValue: String) : Event()

        data class OnPhoneChanged(val newValue: String) : Event()

        data class OnPasswordChanged(val newValue: String) : Event()

        data class OnConfirmPasswordChanged(val newValue: String) : Event()

        sealed class ButtonClick() {

            object OnLoginClick : ButtonClick()

            object OnRegisterClick : ButtonClick()
        }
    }

    data class State(
        val email: String,
        val phone: String,
        val password: String,
        val confirmPassword: String,
    ) : ViewState {

        companion object {

            val DEFAULT = State(
                email = "",
                phone = "",
                password = "",
                confirmPassword = "",
            )
        }
    }

    sealed class Effect : ViewSideEffect {

        sealed class Navigation : Effect() {

            object OnBackPressed : Navigation()

            object ToLogin : Navigation()
        }
    }
}
