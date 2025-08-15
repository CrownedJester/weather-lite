package com.crowedjester.edu.weatherlite.presentation.main_screen.util

import androidx.compose.ui.graphics.Brush
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Dawn.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Dawn.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Dawn.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Dawn.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Dawn.Windy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Evening.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Evening.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Evening.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Evening.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Evening.Windy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Morning.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Morning.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Morning.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Morning.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Morning.Windy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Night.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Night.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Night.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Night.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Night.Windy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Noon.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Noon.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Noon.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Noon.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Noon.Windy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Twilight.Cloudy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Twilight.Rainy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Twilight.Stormy
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Twilight.Sunny
import com.crowedjester.edu.weatherlite.presentation.main_screen.util.TimeOfDay.Twilight.Windy
import com.crowedjester.edu.weatherlite.ui.theme.DawnCloudy
import com.crowedjester.edu.weatherlite.ui.theme.DawnRainy
import com.crowedjester.edu.weatherlite.ui.theme.DawnStormy
import com.crowedjester.edu.weatherlite.ui.theme.DawnSunny
import com.crowedjester.edu.weatherlite.ui.theme.DawnWindy
import com.crowedjester.edu.weatherlite.ui.theme.EveningCloudy
import com.crowedjester.edu.weatherlite.ui.theme.EveningRainy
import com.crowedjester.edu.weatherlite.ui.theme.EveningStormy
import com.crowedjester.edu.weatherlite.ui.theme.EveningSunny
import com.crowedjester.edu.weatherlite.ui.theme.EveningWindy
import com.crowedjester.edu.weatherlite.ui.theme.MorningCloudy
import com.crowedjester.edu.weatherlite.ui.theme.MorningRainy
import com.crowedjester.edu.weatherlite.ui.theme.MorningStormy
import com.crowedjester.edu.weatherlite.ui.theme.MorningSunny
import com.crowedjester.edu.weatherlite.ui.theme.MorningWindy
import com.crowedjester.edu.weatherlite.ui.theme.NightCloudy
import com.crowedjester.edu.weatherlite.ui.theme.NightRainy
import com.crowedjester.edu.weatherlite.ui.theme.NightStormy
import com.crowedjester.edu.weatherlite.ui.theme.NightSunny
import com.crowedjester.edu.weatherlite.ui.theme.NightWindy
import com.crowedjester.edu.weatherlite.ui.theme.NoonCloudy
import com.crowedjester.edu.weatherlite.ui.theme.NoonRainy
import com.crowedjester.edu.weatherlite.ui.theme.NoonStormy
import com.crowedjester.edu.weatherlite.ui.theme.NoonSunny
import com.crowedjester.edu.weatherlite.ui.theme.NoonWindy
import com.crowedjester.edu.weatherlite.ui.theme.TwilightCloudy
import com.crowedjester.edu.weatherlite.ui.theme.TwilightRainy
import com.crowedjester.edu.weatherlite.ui.theme.TwilightStormy
import com.crowedjester.edu.weatherlite.ui.theme.TwilightSunny
import com.crowedjester.edu.weatherlite.ui.theme.TwilightWindy

enum class WeatherType {
    SUNNY, RAINY, WINDY, STORMY, CLOUDY
}

sealed class TimeOfDay {

    data object Dawn : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = DawnSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = DawnRainy
        )

        val Windy = Brush.verticalGradient(
            colors = DawnWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = DawnStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = DawnCloudy
        )
    }

    data object Morning : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = MorningSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = MorningRainy
        )

        val Windy = Brush.verticalGradient(
            colors = MorningWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = MorningStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = MorningCloudy
        )
    }

    data object Noon : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = NoonSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = NoonRainy
        )

        val Windy = Brush.verticalGradient(
            colors = NoonWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = NoonStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = NoonCloudy
        )
    }

    data object Evening : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = EveningSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = EveningRainy
        )

        val Windy = Brush.verticalGradient(
            colors = EveningWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = EveningStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = EveningCloudy
        )
    }

    data object Twilight : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = TwilightSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = TwilightRainy
        )

        val Windy = Brush.verticalGradient(
            colors = TwilightWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = TwilightStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = TwilightCloudy
        )
    }

    data object Night : TimeOfDay() {

        val Sunny = Brush.verticalGradient(
            colors = NightSunny
        )

        val Rainy = Brush.verticalGradient(
            colors = NightRainy
        )

        val Windy = Brush.verticalGradient(
            colors = NightWindy
        )

        val Stormy = Brush.verticalGradient(
            colors = NightStormy
        )

        val Cloudy = Brush.verticalGradient(
            colors = NightCloudy
        )
    }

    fun gradientFor(weather: WeatherType): Brush {
        return when (this) {
            is Dawn -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }

            is Morning -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }

            is Noon -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }

            is Evening -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }

            is Twilight -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }

            is Night -> when (weather) {
                WeatherType.SUNNY -> Sunny
                WeatherType.RAINY -> Rainy
                WeatherType.WINDY -> Windy
                WeatherType.STORMY -> Stormy
                WeatherType.CLOUDY -> Cloudy
            }
        }
    }
}


fun rememberWeatherColors(weather: WeatherType, timeOfDay: TimeOfDay): Brush {
    return timeOfDay.gradientFor(weather)
}