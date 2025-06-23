package com.blrp.taskmaster.navigate

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blrp.taskmaster.ui.view.HomeScreen
import com.blrp.taskmaster.ui.view.SplashScreen
import com.blrp.taskmaster.ui.viewModel.HomeViewModel

@Composable
fun NavGraph(
    homeViewModel: HomeViewModel,
    modifier: Modifier,
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route
    ) {
        composable(ScreenRoutes.Splashscreen.route) {
            SplashScreen(modifier = modifier, navController = navController)
        }

        composable(ScreenRoutes.Home.route) {
            HomeScreen(modifier = modifier, homeViewModel = homeViewModel)
        }
    }
}