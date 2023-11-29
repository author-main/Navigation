package com.app.navigation.presentation.navigation

sealed class NavigationMode : java.io.Serializable {

    object Stack : NavigationMode()

    class Tabs(
        val tabs: ArrayList<NavTab>,
        val startTabDestinationId: Int?,
    ) : NavigationMode()

}