package com.blrp.taskmaster.navigate

sealed class ScreenRoutes(val route: String) {
    data object Splashscreen : ScreenRoutes("splashscreen")
    data object Home : ScreenRoutes("home")
}