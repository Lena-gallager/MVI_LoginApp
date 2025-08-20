package com.example.mvi_loginapp.feature.loginscreen.impl.viewModel

import com.example.mvi_loginapp.core.uicomponents.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginEvent
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginNavigation
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginState

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
