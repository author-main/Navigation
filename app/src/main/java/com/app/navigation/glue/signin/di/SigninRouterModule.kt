package com.app.navigation.glue.signin.di

import com.app.features.signin.presentation.SigninRouter
import com.app.navigation.glue.signin.AdapterSigninRouter
import dagger.Binds
import dagger.Module

@Module
interface SigninRouterModule {
    @Binds
    fun bindSigninRouter(router: AdapterSigninRouter): SigninRouter
}