package com.blrp.taskmaster.ui.view

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.blrp.taskmaster.R
import com.blrp.taskmaster.navigate.ScreenRoutes

@Composable
fun SplashScreen(
    modifier: Modifier,
    navController: NavController,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDAD5C1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AsyncImage(
            modifier = modifier
                .size(120.dp)
                .padding(8.dp),
            model = R.drawable.planner,
            contentDescription = "planner",
            contentScale = ContentScale.Crop,
        )
        Handler(Looper.getMainLooper()).postDelayed(
            { navController.navigate(ScreenRoutes.Home.route) },
            3000
        )
    }
}