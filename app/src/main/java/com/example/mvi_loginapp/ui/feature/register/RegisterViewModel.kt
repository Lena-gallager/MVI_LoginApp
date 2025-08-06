package com.example.mvi_loginapp.ui.feature.register

import com.example.mvi_loginapp.ui.base.BaseViewModel

class RegisterViewModel : BaseViewModel<RegisterContract.Event, RegisterContract.State, RegisterContract.Effect>() {

    override fun setInitialState(): RegisterContract.State = RegisterContract.State.DEFAULT

    override fun handleEvents(event: RegisterContract.Event) {
        when (event) {
            is RegisterContract.Event.OnPasswordChanged -> setState { copy(password = event.newValue) }
            is RegisterContract.Event.OnConfirmPasswordChanged -> setState { copy(confirmPassword = event.newValue) }
            is RegisterContract.Event.OnEmailChanged -> setState { copy(email = event.newValue) }
            is RegisterContract.Event.OnPhoneChanged -> setState { copy(phone = event.newValue) }
            else -> {}
        }
    }
}
