package com.example.mvi_loginapp.feature.registerscreen.impl.viewModel

import androidx.lifecycle.viewModelScope
import com.example.mvi_loginapp.core.viewModel.BaseViewModel
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterInteractor
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterModel
import com.example.mvi_loginapp.feature.registerscreen.domain.RegisterResult
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterEvent
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterNavigation
import com.example.mvi_loginapp.feature.registerscreen.impl.contract.RegisterState
import com.example.mvi_loginapp.feature.registerscreen.impl.data.RegisterDialogType
import com.example.mvi_loginapp.feature.registerscreen.impl.data.toUi
import kotlinx.coroutines.launch

class RegisterViewModel(
    private val interactor: RegisterInteractor,
) : BaseViewModel<RegisterEvent, RegisterState, RegisterNavigation>() {

    override fun setInitialState(): RegisterState = RegisterState.DEFAULT

    override fun handleEvents(event: RegisterEvent): Unit = when (event) {
        is RegisterEvent.OnPasswordChanged -> setState { copy(password = event.newValue) }
        is RegisterEvent.OnConfirmPasswordChanged -> setState { copy(confirmPassword = event.newValue) }
        is RegisterEvent.OnEmailChanged -> setState { copy(email = event.newValue) }
        is RegisterEvent.OnPhoneChanged -> setState { copy(phone = event.newValue) }
        is RegisterEvent.LoginClicked -> setNavigation { RegisterNavigation.ToLoginScreen }
        is RegisterEvent.CreateAccountClicked -> { performRegister() }
        is RegisterEvent.OnBackPressed -> setNavigation { RegisterNavigation.Back }
        is RegisterEvent.OnSocialMediaClicked -> setState {
            copy(dialogType = RegisterDialogType.SocialMedia(event.type))
        }

        is RegisterEvent.OnDismissDialog -> setState { copy(dialogType = null) }
        is RegisterEvent.ResetError -> setState { copy(errorType = null) }
    }

    private fun performRegister() {
        val state = viewState.value
        val model = RegisterModel(
            email = state.email,
            phone = state.phone,
            password = state.password,
            confirmPassword = state.confirmPassword,
        )
        viewModelScope.launch {
            val result = interactor.register(model)

            when (result) {
                is RegisterResult.Failed -> setState { copy(errorType = result.toUi()) }
                is RegisterResult.Success -> setNavigation { RegisterNavigation.ToLoginScreen }//todo
            }
        }
    }
}
