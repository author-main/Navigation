package com.app.navigation.glue.navigation.di

import com.app.navigation.glue.navigation.DefaultDestinationProvider
import com.app.navigation.presentation.DestinationProvider
import dagger.Binds
import dagger.Module

@Module
interface StartDestinationProvider {
    @Binds
    fun bindStartDestinationProvider(startDestinationProvider: DefaultDestinationProvider): DestinationProvider
}