package ru.gb.weatherapp.viewmodel

// ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.gb.weatherapp.model.Repository
import java.util.*

class MainViewModel : ViewModel() {

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

    fun setCity(position: Int) {
        _city.value = repositoryCall.getCity(position)
        getAverageTemp(_city.value!!)
    }

    private fun getAverageTemp(city: String) {
        when (city) {
            "Berlin" -> _temp.value = repositoryCall.getterOfBerlinTemp(_month)
            "Brussels" -> _temp.value = repositoryCall.getterOfBrusselsTemp(_month)
            "Helsinki" -> _temp.value = repositoryCall.getterOfHelsinkiTemp(_month)
            "Lyon" -> _temp.value = repositoryCall.getterOfLyonTemp(_month)
            "Minsk" -> _temp.value = repositoryCall.getterOfMinskTemp(_month)
            "Moscow" -> _temp.value = repositoryCall.getterOfMoscowTemp(_month)
            "Nicosia" -> _temp.value = repositoryCall.getterOfNicosiaTemp(_month)
            "Oslo" -> _temp.value = repositoryCall.getterOfOsloTemp(_month)
            "Paris" -> _temp.value = repositoryCall.getterOfParisTemp(_month)
            "Prague"-> _temp.value = repositoryCall.getterOfPragueTemp(_month)
            "Sofia" -> _temp.value = repositoryCall.getterOfSofiaTemp(_month)
            "Tallinn" -> _temp.value = repositoryCall.getterOfTallinnTemp(_month)
            "Vienna" -> _temp.value = repositoryCall.getterOfViennaTemp(_month)
            "Warsaw" -> _temp.value = repositoryCall.getterOfWarsawTemp(_month)

            //"New York" -> _temp.value = repositoryCall.getterOfNewYorkTemp(_month)

        }
    }

}