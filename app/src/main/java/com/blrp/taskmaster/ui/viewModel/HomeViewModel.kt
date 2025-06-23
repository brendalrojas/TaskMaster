package com.blrp.taskmaster.ui.viewModel

import androidx.lifecycle.ViewModel
import com.blrp.taskmaster.ui.event.HomeUiEvent
import com.blrp.taskmaster.ui.state.HomeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _homeUiState = MutableStateFlow(HomeUiState())
    val homeUiState = _homeUiState.asStateFlow()

    fun homeUiEvent(event: HomeUiEvent) {
        when (event) {
            is HomeUiEvent.AddTask -> TODO()
            is HomeUiEvent.CloseTaskDialog -> TODO()
            is HomeUiEvent.CompletedTask -> TODO()
            is HomeUiEvent.OpenTaskDialog -> TODO()
            is HomeUiEvent.ToggleDialog -> TODO()
        }
    }
}