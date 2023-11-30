package com.app.navigation.glue.navigation

import android.content.Context
import com.app.navigation.R
import com.app.navigation.presentation.DestinationProvider
import com.app.navigation.presentation.navigation.NavTab

class DefaultDestinationProvider(private val context: Context): DestinationProvider {
    override fun provideMainTabs(): List<NavTab> {
        return listOf(
            NavTab(
                destinationId = R.id.catalogFragment,
                title = context.getString(R.string.tab_catalog),
                iconRes = R.drawable.ic_catalog,
            ),
            NavTab(
                destinationId = R.id.profileFragment,
                title = context.getString(R.string.tab_profile),
                iconRes = R.drawable.ic_profile,
            ),
            NavTab(
                destinationId = R.id.cartFragment,
                title = context.getString(R.string.tab_profile),
                iconRes = R.drawable.ic_cart,
            )
        )
    }
}