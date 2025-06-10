package com.blrp.taskmaster.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.blrp.taskmaster.ui.components.Header
import com.blrp.taskmaster.ui.viewModel.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier,
    homeViewModel: HomeViewModel,
) {
    val homeUiState by homeViewModel.homeUiState.collectAsState()

    Column(
        modifier = modifier.background(Color(0xFFFFFFFF))
    ) {
        Header()
        Text(text = "My tasks")
        Text(text = "Completed tasks")
    }
    //header


    //my tasks

    // completed tasks

    //floating button

}

/*
@Preview
@Composable
fun HomeScreenPreview(){
HomeScreen()
}*/
