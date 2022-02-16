package ru.gb.weatherapp.viewmodel

// ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.weatherapp.model.Repository
import java.util.*

class MainViewModel() : ViewModel() {

    private var _city = MutableLiveData<String>()
    val city: LiveData<String>
        get() = _city

    private var _temp = MutableLiveData<String>()
    val temp: LiveData<String>
        get() = _temp

    private val _month = Calendar.MONTH

    private val repositoryCall = Repository()

    init {
        _city.value = ""
    }

    fun setMoscow() {
        _city.value = "Moscow"
        getAverageTemp(_city.value!!)
    }

    fun setNewYork() {
        _city.value = "New York"
        getAverageTemp(_city.value!!)
    }

    fun setHelsinki() {
        _city.value = "Helsinki"
        getAverageTemp(_city.value!!)
    }

    private fun getAverageTemp(city: String) {
        when (city) {
            "Moscow" -> _temp.value = repositoryCall.getterOfMoscowTemp(_month)
            "New York" -> _temp.value = repositoryCall.getterOfNewYorkTemp(_month)
            "Helsinki" -> _temp.value = repositoryCall.getterOfHelsinkiTemp(_month)
        }
    }

}