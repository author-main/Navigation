package com.app.navigation.glue.catalog.di

import com.app.features.catalog.presentation.CatalogRouter
import com.app.navigation.glue.catalog.AdapterCatalogRouter
import dagger.Binds
import dagger.Module

@Module
interface CatalogRouterModule {
    @Binds
    fun bindCatalogRouter(router: AdapterCatalogRouter): CatalogRouter

}