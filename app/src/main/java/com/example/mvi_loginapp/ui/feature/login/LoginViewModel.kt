package com.example.mvi_loginapp.ui.feature.login

import com.example.mvi_loginapp.ui.base.BaseViewModel

class LoginViewModel :
    BaseViewModel<LoginContract.Event, LoginContract.State, LoginContract.Effect>() {

    override fun setInitialState(): LoginContract.State = LoginContract.State.DEFAULT

    override fun handleEvents(event: LoginContract.Event) {
        when(event) {
            is LoginContract.Event.OnEmailChanged -> setState { copy(email = event.newValue) }
            is LoginContract.Event.OnPasswordChanged -> setState { copy(password = event.newValue) }
            is LoginContract.Event.ButtonClick.OnRegisterClicked -> setEffect { LoginContract.Effect.Navigation.ToRegistration }
            else -> {}
        }
    }
}
