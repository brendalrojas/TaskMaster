package com.blrp.taskmaster.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.blrp.taskmaster.navigate.NavGraph
import com.blrp.taskmaster.ui.components.Header
import com.blrp.taskmaster.ui.theme.TaskMasterTheme
import com.blrp.taskmaster.ui.viewModel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TaskMasterTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFFFFFFFF),
                    topBar = { Header() },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { },
                            shape = CircleShape,
                        ) {
                            Icon(Icons.Filled.Add, "Small floating action button.")
                        }
                    },
                    content = { paddingValue ->
                        NavGraph(
                            modifier = Modifier.padding(paddingValue),
                            homeViewModel = homeViewModel
                        )
                    }
                )
            }
        }
    }
}
