package com.tamayo.jetlogin.core.di

import com.tamayo.jetlogin.login.data.network.LoginClient
import com.tamayo.jetlogin.login.data.network.LoginService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModulo {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun providesApi(retrofit: Retrofit): LoginClient =
        retrofit.create(LoginClient::class.java)


}