package com.example.mvi_loginapp.ui.feature.login

import com.example.mvi_loginapp.ui.base.BaseViewModel
import com.example.mvi_loginapp.ui.feature.login.contract.LoginEvent
import com.example.mvi_loginapp.ui.feature.login.contract.LoginNavigation
import com.example.mvi_loginapp.ui.feature.login.contract.LoginState

class LoginViewModel : BaseViewModel<LoginEvent, LoginState, LoginNavigation>() {

    override fun setInitialState(): LoginState = LoginState.DEFAULT

    override fun handleEvents(event: LoginEvent) {
        when (event) {
            is LoginEvent.OnEmailChanged -> setState { copy(email = event.newValue) }
            is LoginEvent.OnPasswordChanged -> setState { copy(password = event.newValue) }
            is LoginEvent.OnRegisterClicked -> setNavigation { LoginNavigation.ToRegistrationScreen }
            else -> {}
        }
    }
}
