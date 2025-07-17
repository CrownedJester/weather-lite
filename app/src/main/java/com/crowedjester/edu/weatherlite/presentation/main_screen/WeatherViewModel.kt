package com.crowedjester.edu.weatherlite.presentation.main_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.crowedjester.edu.weatherlite.common.IO
import com.crowedjester.edu.weatherlite.domain.model.SearchResult
import com.crowedjester.edu.weatherlite.domain.use_cases.SearchUseCase
import com.crowedjester.edu.weatherlite.presentation.main_screen.event.MainScreenEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.LinkedList
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(private val searchUseCase: SearchUseCase) : ViewModel() {


    private val _searchResultStateFlow = MutableStateFlow(SearchResult())
    val searchResultStateFlow = _searchResultStateFlow.asStateFlow()

    //mocking (todo implement DB in future)
    private val _savedQueries = MutableStateFlow(LinkedList<String>())
    val savedQueries = _savedQueries.asStateFlow()

    init {

    }

    fun onEvent(event: MainScreenEvents) {
        when (event) {

            is MainScreenEvents.Search -> {

                viewModelScope.launch(IO) {
                    _searchResultStateFlow.emit(
                        searchUseCase(event.query)
                    )
                }

            }

            is MainScreenEvents.SaveQuery -> {
                viewModelScope.launch(IO) {
                    _savedQueries.value.run {

                        addFirst(event.query)

                        if (size > 5) {
                            removeLast()
                        }
                    }

                }

            }
        }
    }
}