package ru.gb.weatherapp.model.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import ru.gb.weatherapp.BuildConfig

interface NetworkConnect {
    @Headers("X-Yandex-API-Key: ${BuildConfig.WEATHER_API_KEY}")
    @GET("v2/informers?")
    fun getTemperature(
        @Query("lat") latitude: Double,
        @Query("lon") longtitude: Double,
        @Query("lang") language: String
    ): Call<WeatherDTO>

    companion object {
        private const val BASE_URL = "https://api.weather.yandex.ru/"

        fun returnToVmFunction(): NetworkConnect {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(NetworkConnect::class.java)
        }
    }
}