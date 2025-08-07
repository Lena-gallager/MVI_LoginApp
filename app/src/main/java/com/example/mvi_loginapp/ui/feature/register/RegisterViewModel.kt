package com.example.mvi_loginapp.ui.feature.register

import com.example.mvi_loginapp.ui.base.BaseViewModel
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterEvent
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterNavigation
import com.example.mvi_loginapp.ui.feature.register.contract.RegisterState

class RegisterViewModel : BaseViewModel<RegisterEvent, RegisterState, RegisterNavigation>() {

    override fun setInitialState(): RegisterState = RegisterState.DEFAULT

    override fun handleEvents(event: RegisterEvent) {
        when (event) {
            is RegisterEvent.OnPasswordChanged -> setState { copy(password = event.newValue) }
            is RegisterEvent.OnConfirmPasswordChanged -> setState { copy(confirmPassword = event.newValue) }
            is RegisterEvent.OnEmailChanged -> setState { copy(email = event.newValue) }
            is RegisterEvent.OnPhoneChanged -> setState { copy(phone = event.newValue) }
            is RegisterEvent.LoginClicked -> setNavigation { RegisterNavigation.ToLoginScreen }
            is RegisterEvent.CreateAccountClicked -> {  }
            is RegisterEvent.OnBackPressed -> setNavigation { RegisterNavigation.Back }
        }
    }
}
