package com.example.mvi_loginapp.feature.loginscreen.impl.viewModel

import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginEvent
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginNavigation
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginState
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginDialogType

class LoginViewModel : BaseViewModel<LoginEvent, LoginState, LoginNavigation>() {

    override fun setInitialState(): LoginState = LoginState.DEFAULT

    override fun handleEvents(event: LoginEvent) {
        when (event) {
            is LoginEvent.OnEmailChanged -> setState { copy(email = event.newValue) }
            is LoginEvent.OnPasswordChanged -> setState { copy(password = event.newValue) }
            is LoginEvent.OnRegisterClicked -> setNavigation { LoginNavigation.ToRegistrationScreen }
            is LoginEvent.OnSocialMediaClicked -> setState {
                copy(dialogType = LoginDialogType.SocialMedia(event.type))
            }

            is LoginEvent.OnForgotPasswordCLicked -> setState { copy(dialogType = LoginDialogType.PasswordChange) }
            is LoginEvent.OnDismissDialog -> setState { copy(dialogType = null) }
            is LoginEvent.OnLoginClicked -> {}
        }
    }
}
