package com.crowedjester.edu.weatherlite.presentation.main_screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.crowedjester.edu.weatherlite.R
import com.crowedjester.edu.weatherlite.domain.model.SearchResult
import com.crowedjester.edu.weatherlite.presentation.main_screen.event.SearchEvents
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.WeatherType
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.rememberWeatherColors
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun SearchScreen(modifier: Modifier = Modifier, searchViewModel: SearchViewModel = viewModel()) {

    val screenHeight = LocalConfiguration.current.screenHeightDp
    val keyboardController = LocalSoftwareKeyboardController.current

    val searchResult = searchViewModel.searchResultStateFlow.collectAsState().value

    var query by rememberSaveable { mutableStateOf("") }

    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .background(
                brush = rememberWeatherColors(
                    WeatherType.SUNNY,
                    TimeOfDay.Dawn
                )
            )
            .padding(start = 12.dp, end = 12.dp)
            .clickable {
                keyboardController?.hide()
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .padding(top = 32.dp, bottom = 8.dp)
                .fillMaxWidth(0.9f),

            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = query,
                onValueChange = {
                    if (!isVisible) {
                        isVisible = true
                    }
                    query = it

                    if (query.isNotEmpty() && query.isNotBlank()) {
                        searchViewModel.onEvent(SearchEvents.Search(query))
                    }

                },
                placeholder = {
                    Text(
                        "Find town by name or coordinates",
                        color = Color.Gray,
                        fontSize = 12.sp,
                        maxLines = 1
                    )
                },
                leadingIcon = {
                    IconButton(onClick = {
                        if (query.isNotEmpty()) {
                            searchViewModel.onEvent(SearchEvents.Search(query))
                        }
                    }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = null)
                    }
                },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(onSearch = {
                    isVisible = true
                    searchViewModel.onEvent(SearchEvents.Search(query))
                    keyboardController?.hide()

                }),
                shape = RoundedCornerShape(60),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    cursorColor = Color(0xFF536DFE),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedContainerColor = Color(0x33888888),
                    focusedContainerColor = Color(0x599A9A9A)
                )
            )

            SearchResultColumn(
                modifier = Modifier
                    .fillMaxWidth(0.9f),
                data = searchResult.data,
                isQueryNotEmpty = query.isNotEmpty(),
                visible = isVisible
            )
        }

        Text(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 24.dp),
            text = "${"Minsk"}, ${"Belarus"}",
            style = MaterialTheme.typography.titleMedium
        )



        Text(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 24.dp),
            text = getCurrentDate(),
            style = MaterialTheme.typography.bodySmall,
            fontSize = 8.sp

        )

        Spacer(modifier = Modifier.height(12.dp))


        CurrentWeatherItem(id = R.drawable.search_screen_bg, temp = 20)

        Spacer(modifier = Modifier.height(28.dp))


        LazyRow(
            modifier = Modifier.padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(5) {

                DayForecastItem(modifier = Modifier, time = "20:00", temp = 20, asset = "")

            }
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(0.95f)
        ) {
            Text(text = "Favorite locations")

            TextButton(onClick = {
                //todo navigate
            }) {
                Text("View All")

                Icon(
                    imageVector = Icons.AutoMirrored.Sharp.KeyboardArrowRight,
                    contentDescription = null
                )
            }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(12.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(4) {
                MainScreenFavoriteItem(
                    modifier = Modifier,
                    temp = 20,
                    country = "Belarus",
                    city = "Minsk",
                    weather = "Rainy",
                    asset = ""
                )
            }

        }


    }

}


@Composable
fun DayForecastItem(modifier: Modifier = Modifier, time: String, temp: Int, asset: String) {
    Card(
        modifier = modifier
            .height(110.dp)
            .width(50.dp)
            .alpha(0.6f),
        shape = RoundedCornerShape(48),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 4.dp, vertical = 8.dp),

            ) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = time,
                fontSize = 11.sp
            )

            Image(
                modifier = Modifier
                    .size(48.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(R.drawable.search_screen_bg),
                contentDescription = null
            )

            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "$temp$celsiusSymbol",
                fontSize = 11.sp
            )


        }
    }
}


@Composable
fun CurrentWeatherItem(modifier: Modifier = Modifier, id: Int, temp: Int) {

    Image(
        modifier = modifier
            .size(156.dp),
        painter = painterResource(id),
        contentDescription = null
    )

    Text("$temp$celsiusSymbol", style = MaterialTheme.typography.headlineLarge)

}

@Composable
fun MainScreenFavoriteItem(
    modifier: Modifier = Modifier,
    temp: Int,
    country: String,
    city: String,
    weather: String,
    asset: String,
) {

    Card(modifier = modifier, shape = RoundedCornerShape(24)) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {

            Text(text = buildAnnotatedString {

                withStyle(
                    SpanStyle(
                        fontSize = 16.sp
                    )
                ) {
                    append("$temp$celsiusSymbol ")
                }

                withStyle(
                    SpanStyle(
                        fontSize = 12.sp,
                        color = Color(0xFF757373)
                    )
                ) {
                    append(weather)
                }

                append("\n")

                withStyle(
                    SpanStyle(
                        fontSize = 14.sp
                    )
                ) {
                    append(city)
                }

                append(", ")

                withStyle(
                    SpanStyle(
                        fontSize = 12.sp,
                        color = Color(0xFF757373)
                    )
                ) {
                    append(country)
                }


            })


            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(R.drawable.search_screen_bg),
                contentDescription = null
            )
        }
    }


}

@Composable
private fun SearchResultColumn(
    modifier: Modifier = Modifier,
    data: List<SearchResult>,
    isQueryNotEmpty: Boolean,
    visible: Boolean,
) {

    AnimatedVisibility(
        visible = isQueryNotEmpty && visible
    ) {
        Card(
            modifier = modifier,
            shape = RectangleShape,
            colors = CardDefaults.cardColors(containerColor = Color(0x0F918F8F)),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 12.dp),
                horizontalAlignment = Alignment.Start
            ) {
                items(data.size) {
                    TextButton(
                        modifier = Modifier
                            .fillMaxWidth(),
                        onClick = {
                            //todo navigation

                        }) {

                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Start,
                            text = buildAnnotatedString {
                                append(data[it].name)

                                withStyle(style = SpanStyle(fontSize = 12.sp)) {
                                    append("(${data[it].country})")
                                }

                            })
                    }
                }
            }
        }
    }
}


fun Int.calcPercentage(f: Double): Double =
    if (f > 1) this.toDouble() else if (f < 0) 0.0 else this * f

private fun getCurrentDate(): String {
    val date = LocalDate.now()
    val formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.ENGLISH)
    return date.format(formatter)
}

const val celsiusSymbol = "°С"