package com.app.navigation.presentation.navigation

sealed class NavigationMode : java.io.Serializable {

    data object Stack : NavigationMode()

    class Tabs(
        val tabs: ArrayList<NavTab>,
        val startTabDestinationId: Int?,
    ) : NavigationMode()

}