package com.example.mvi_loginapp.feature.loginscreen.impl.viewModel

import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginInteractor
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginModel
import com.example.mvi_loginapp.feature.loginscreen.domain.LoginResult
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginEvent
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginNavigation
import com.example.mvi_loginapp.feature.loginscreen.impl.contract.LoginState
import com.example.mvi_loginapp.feature.loginscreen.impl.data.LoginDialogType
import com.example.mvi_loginapp.feature.loginscreen.impl.data.toUi
import kotlinx.coroutines.launch

class LoginViewModel(
    private val interactor: LoginInteractor,
) : BaseViewModel<LoginEvent, LoginState, LoginNavigation>() {

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
            //todo im stupid or what. why i cant use function reference (::performLogin just not invokes)
            is LoginEvent.OnLoginClicked -> { performLogin() }
            is LoginEvent.ResetError -> setState { copy(errorType = null) }
        }
    }

    private fun performLogin() {
        val state = viewState.value
        val model = LoginModel(email = state.email, password = state.password)

        viewModelScope.launch {
            val result = interactor.login(model)

            when (result) {
                is LoginResult.Failed -> setState { copy(errorType = result.toUi()) }
                is LoginResult.Success -> setNavigation { LoginNavigation.ToRegistrationScreen }//todo
            }
        }
    }
}
