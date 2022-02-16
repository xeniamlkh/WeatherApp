package ru.gb.weatherapp.model

// Data Layer (Model)

class Repository() {

    private val moscowTemp: Map<Int, String> = mapOf(
        1 to "-6.7",
        2 to "-6.1",
        3 to "+0.8",
        4 to "+6.9",
        5 to "+13.5",
        6 to "+17.2",
        7 to "+20.1",
        8 to "+17.8",
        9 to "+11.9",
        10 to "+5.9",
        11 to "+0.1",
        12 to "-4.2"
    )

    fun getterOfMoscowTemp(month: Int): String? {
        return moscowTemp[month]
    }

    private val newYorkTemp: Map<Int, String> = mapOf(
        1 to "+4.2",
        2 to "+5.1",
        3 to "+10.8",
        4 to "+16.4",
        5 to "+22.5",
        6 to "+27.1",
        7 to "+29.7",
        8 to "+28.3",
        9 to "+24.6",
        10 to "+18.2",
        11 to "+12.2",
        12 to "+6.5"
    )

    fun getterOfNewYorkTemp(month: Int): String? {
        return newYorkTemp[month]
    }

    private val helsinkiTemp: Map<Int, String> = mapOf(
        1 to "-2.1",
        2 to "-1.9",
        3 to "+0.9",
        4 to "+5.9",
        5 to "+12.2",
        6 to "+17.3",
        7 to "+20.5",
        8 to "+19.4",
        9 to "+15.0",
        10 to "+8.7",
        11 to "+4.7",
        12 to "+1.3"
    )

    fun getterOfHelsinkiTemp(month: Int): String? {
        return helsinkiTemp[month]
    }

}
