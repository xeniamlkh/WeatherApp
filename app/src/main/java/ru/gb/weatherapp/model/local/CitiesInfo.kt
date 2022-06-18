package ru.gb.weatherapp.model.local

// Data Layer (Model)

class CitiesInfo() {

    private val cityNames: List<String> = listOf(
        "Berlin",
        "Brussels",
        "Helsinki",
        "Lyon",
        "Minsk",
        "Moscow",
        "Nicosia",
        "Oslo",
        "Paris",
        "Prague",
        "Sofia",
        "Tallinn",
        "Vienna",
        "Warsaw"
    )

    fun getCities(): List<String> {
        return cityNames
    }

    fun getCity(index: Int): String {
        return cityNames[index]
    }

    private val citiesCoordinates: Map<Int, Coordinates> = mapOf(
        0 to Coordinates(52.5200, 13.4050),
        1 to Coordinates(50.8476, 4.3572),
        2 to Coordinates(60.1699, 24.9384),
        3 to Coordinates(45.7640, 4.8357),
        4 to Coordinates(53.9006, 27.5590),
        5 to Coordinates(55.7558, 37.6173),
        6 to Coordinates(35.1856, 33.3823),
        7 to Coordinates(59.9139, 10.7522),
        8 to Coordinates(48.8566, 2.3522),
        9 to Coordinates(50.0755, 14.4378),
        10 to Coordinates(42.6977, 23.3219),
        11 to Coordinates(59.4370, 24.7536),
        12 to Coordinates(48.2082, 16.3738),
        13 to Coordinates(52.2297, 21.0122)
    )

    private val listCoordinates: List<Double> = listOf(

    )

    fun getterOfCoordinates(key: Int): Coordinates? {
        println("Latitude= ${citiesCoordinates[key]?.lat}, " +
                "Longtitude= ${citiesCoordinates[key]?.lon}")
        return citiesCoordinates[key]
    }

}

class City(val cityName: String) {}
class Coordinates(val lat: Double, val lon: Double) {}
