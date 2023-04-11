package com.tamayo.jetlogin.login.data.network

import com.tamayo.jetlogin.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean =
        withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()
                response.body()?.success ?: false

    }
}