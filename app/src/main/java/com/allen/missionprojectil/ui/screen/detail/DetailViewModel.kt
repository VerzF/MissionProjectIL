package com.allen.missionprojectil.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.allen.missionprojectil.data.DrinkRepository
import com.allen.missionprojectil.model.SelectDrink
import com.allen.missionprojectil.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel (private val repository: DrinkRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<SelectDrink>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<SelectDrink>>
        get() = _uiState

    fun getDrinkById(drinkId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getSelectDrinkById(drinkId))
        }
    }
}