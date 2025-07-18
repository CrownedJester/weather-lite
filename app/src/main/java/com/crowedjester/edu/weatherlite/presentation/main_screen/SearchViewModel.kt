package com.crowedjester.edu.weatherlite.presentation.main_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.network.HttpException
import com.crowedjester.edu.weatherlite.common.IO
import com.crowedjester.edu.weatherlite.domain.use_cases.SearchUseCase
import com.crowedjester.edu.weatherlite.presentation.main_screen.event.SearchEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import java.util.LinkedList
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val searchUseCase: SearchUseCase) : ViewModel() {


    private val _searchResultStateFlow = MutableStateFlow(SearchDataState())
    val searchResultStateFlow = _searchResultStateFlow.asStateFlow()

    //mocking (todo implement DB in future)
    private val _savedQueries = MutableStateFlow(LinkedList<String>())
    val savedQueries = _savedQueries.asStateFlow()

    init {

    }

    fun onEvent(event: SearchEvents) {
        when (event) {

            is SearchEvents.Search -> {

                viewModelScope.launch(IO) {

                    try {
                        _searchResultStateFlow.apply {
                            emit(value.copy(isLoading = true))

                            emit(
                                value.copy(
                                    isLoading = false,
                                    data = searchUseCase(
                                        event.query
                                    )
                                )
                            )
                        }
                    } catch (e: HttpException) {
                        _searchResultStateFlow.apply {
                            emit(
                                value.copy(
                                    isLoading = false,
                                    error = e.message.toString()
                                )
                            )
                        }

                    } catch (e: IOException) {

                        _searchResultStateFlow.apply {
                            emit(
                                value.copy(
                                    isLoading = false,
                                    error = e.message.toString()
                                )
                            )
                        }

                    }


                }

            }

            is SearchEvents.SaveQuery -> {
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