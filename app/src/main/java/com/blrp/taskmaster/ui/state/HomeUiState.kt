package com.blrp.taskmaster.ui.state

import com.blrp.taskmaster.data.model.Task

data class HomeUiState(
    val loading: Boolean = false,
    val showDialog: Boolean = false,
    val openTaskDialog: Boolean = false,
    val selectedTask: Task? = null,
    val showError: Boolean = false,
    val errorMessage: String? = null,
    val taskList: MutableList<Task> = mutableListOf(),
    val completedTaskList: MutableList<Task> = mutableListOf(),
)