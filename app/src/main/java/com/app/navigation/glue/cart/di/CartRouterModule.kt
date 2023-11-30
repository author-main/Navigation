package com.app.navigation.glue.cart.di

import com.app.features.cart.presentation.CartRouter
import com.app.navigation.glue.cart.AdapterCartRouter
import dagger.Binds
import dagger.Module

@Module
interface CartRouterModule {
    @Binds
    fun bindCartRouter(router: AdapterCartRouter): CartRouter
}