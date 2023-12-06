package com.app.navigation.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.navigation.R
import com.app.navigation.presentation.navigation.NavigationMode
import com.app.navigation.presentation.navigation.NavigationModeHolder
import javax.inject.Inject

//@AndroidEntryPoint
class TabsFragment : Fragment() {

    @Inject
    lateinit var navigationModeHolder: NavigationModeHolder

   /* override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabs, container, false)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (navigationModeHolder.navigationMode is NavigationMode.Tabs) {

        }
    }
}