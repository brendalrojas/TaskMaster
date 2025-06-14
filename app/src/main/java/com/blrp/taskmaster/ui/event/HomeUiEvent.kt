package com.blrp.taskmaster.ui.event

import com.blrp.taskmaster.data.model.Task

sealed interface HomeUiEvent {
    data object ToggleDialog : HomeUiEvent
    data class AddTask(val task: Task) : HomeUiEvent
    data class CompletedTask(val index: Int) : HomeUiEvent
    data class OpenTaskDialog(val task: Task) : HomeUiEvent
    data object CloseTaskDialog : HomeUiEvent
}