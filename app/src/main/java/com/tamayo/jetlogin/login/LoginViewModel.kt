package com.tamayo.jetlogin.login

import android.util.Patterns
import android.view.animation.Animation
import androidx.compose.runtime.Composable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel() {

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    val isEnable = MutableLiveData<Boolean>()


    fun onLoginChanged(email: String, password: String) {
            _email.value = email
            _password.value = password
       isEnable.value = enableLogin(email, password)
    }


    private fun enableLogin(email: String, password: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6



}