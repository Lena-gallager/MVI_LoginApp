package com.example.mvi_loginapp.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface NavigationProvider {

    fun registerRoutes(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
    )
}
