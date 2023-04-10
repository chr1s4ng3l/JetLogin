package com.tamayo.jetlogin.login.data

import com.tamayo.jetlogin.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()
    suspend fun doLogin(user: String, password: String): Boolean =
        api.doLogin(user, password)

}