package com.app.navigation.glue.signup.di

import com.app.features.signup.presentation.SignupRouter
import com.app.navigation.glue.signup.AdapterSignupRouter
import dagger.Binds
import dagger.Module

@Module
//@InstallIn(ActivityRetainedComponent::class)
interface SignupRouterModule {
    @Binds
    fun bindSignupRouter(router: AdapterSignupRouter): SignupRouter
}