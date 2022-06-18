package ru.gb.weatherapp.model.network


import com.google.gson.annotations.SerializedName

data class WeatherDTO(
    @SerializedName("fact")
    val fact: FactDTO?
)

data class FactDTO(
    @SerializedName("temp")
    val temp: Int?
)