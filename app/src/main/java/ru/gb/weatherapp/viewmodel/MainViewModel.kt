package ru.gb.weatherapp.viewmodel

// ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.gb.weatherapp.model.local.CitiesInfo
import ru.gb.weatherapp.model.network.WeatherDTO
import ru.gb.weatherapp.model.network.NetworkConnect

class MainViewModel : ViewModel() {

    private var _city = MutableLiveData<String>()
    val city: LiveData<String>
        get() = _city

    private var _temp = MutableLiveData<String>()
    val temp: LiveData<String>
        get() = _temp

    private val cityReturnData = CitiesInfo()

    init {
        _city.value = ""
        _temp.value = ""
    }

    fun setCity(position: Int) {
        _city.value = cityReturnData.getCity(position)
        //_city.value?.let { getAverageTemp(it) }
        var latitude = cityReturnData.getterOfCoordinates(position)?.lat
        var longtitude = cityReturnData.getterOfCoordinates(position)?.lon
        println("!! Coordinates: $latitude ; $longtitude")

        val mCallMethodVar = longtitude?.let {
            latitude?.let { it1 ->
                NetworkConnect
                    .returnToVmFunction()
                    .getTemperature(
                        latitude = it1, longtitude = it,
                        language = "en_US"
                    )
            }
        }

        mCallMethodVar?.enqueue(object : Callback<WeatherDTO> {

            override fun onResponse(call: Call<WeatherDTO>, response: Response<WeatherDTO>) {
                if (!response.isSuccessful) {
                    _temp.value = "ERROR: ${response.code()}"
                }
                val body = response.body()
                _temp.value = body?.fact?.temp.toString()
            }

            override fun onFailure(call: Call<WeatherDTO>, t: Throwable) {
                _temp.value = "ERROR: ${t.message}"
            }
        })

    }
}