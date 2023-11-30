package com.app.navigation.presentation

import com.app.navigation.presentation.navigation.NavTab

interface DestinationProvider {

    fun provideMainTabs(): List<NavTab>

}