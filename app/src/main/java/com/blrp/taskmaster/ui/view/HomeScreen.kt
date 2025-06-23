package com.blrp.taskmaster.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.blrp.taskmaster.ui.components.SubtitleSection
import com.blrp.taskmaster.ui.components.TaskItem
import com.blrp.taskmaster.ui.viewModel.HomeViewModel

@Composable
fun HomeScreen(
    modifier: Modifier,
    homeViewModel: HomeViewModel,
) {
    val scrollState = rememberScrollState()

    val homeUiState by homeViewModel.homeUiState.collectAsState()

    val list = listOf(
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
        "1", "2", "3",
    )


    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
    ) {
        SubtitleSection("My tasks")
        list.forEachIndexed { index, task ->
            TaskItem(
            )
        }
    }

}


/*Scaffold(
    modifier = modifier.fillMaxSize(),
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
        Column(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
                .verticalScroll(scrollState),
        ) {
            SubtitleSection("My tasks")
            homeUiState.taskList.forEachIndexed { index, task ->
                TaskItem(
                    homeUiState.taskList[index],
                    onTaskCompleted = { checked ->
                        if (checked) {
                            homeViewModel.homeUiEvent(event = HomeUiEvent.CompletedTask(index = index))
                        }
                    },
                    onClick = {
                        homeViewModel.homeUiEvent(event = HomeUiEvent.OpenTaskDialog(homeUiState.taskList[index]))
                    })
            }
            SubtitleSection("My tasks")

        }
        }*/
