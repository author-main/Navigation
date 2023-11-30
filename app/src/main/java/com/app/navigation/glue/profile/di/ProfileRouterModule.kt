package com.app.navigation.glue.profile.di

import com.app.features.profile.presentation.ProfileRouter
import com.app.navigation.glue.profile.AdapterProfileRouter
import dagger.Binds
import dagger.Module

@Module
interface ProfileRouterModule {
    @Binds
    fun bindProfileRouter(router: AdapterProfileRouter): ProfileRouter
}