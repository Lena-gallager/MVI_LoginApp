package com.example.mvi_loginapp.feature.registerscreen.impl.viewModel

import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterEvent
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterNavigation
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterState
import com.example.mvi_loginapp.feature.registerscreen.impl.data.RegisterDialogType

class RegisterViewModel : BaseViewModel<RegisterEvent, RegisterState, RegisterNavigation>() {

    override fun setInitialState(): RegisterState = RegisterState.DEFAULT

    override fun handleEvents(event: RegisterEvent): Unit = when (event) {
        is RegisterEvent.OnPasswordChanged -> setState { copy(password = event.newValue) }
        is RegisterEvent.OnConfirmPasswordChanged -> setState { copy(confirmPassword = event.newValue) }
        is RegisterEvent.OnEmailChanged -> setState { copy(email = event.newValue) }
        is RegisterEvent.OnPhoneChanged -> setState { copy(phone = event.newValue) }
        is RegisterEvent.LoginClicked -> setNavigation { RegisterNavigation.ToLoginScreen }
        is RegisterEvent.CreateAccountClicked -> {}
        is RegisterEvent.OnBackPressed -> setNavigation { RegisterNavigation.Back }
        is RegisterEvent.OnSocialMediaClicked -> setState {
            copy(dialogType = RegisterDialogType.SocialMedia(event.type))
        }

        is RegisterEvent.OnDismissDialog -> setState { copy(dialogType = null) }
    }
}
