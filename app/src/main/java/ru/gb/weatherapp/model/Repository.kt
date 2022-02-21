package ru.gb.weatherapp.model

// Data Layer (Model)

class Repository() {

    // EUROPE
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

    fun getCity(index : Int) : String {
        return cityNames[index]
    }

    private val berlinTemp: Map<Int, String> = mapOf(
        1 to "+0.6",
        2 to "+2.3",
        3 to "+5.1",
        4 to "+10.2",
        5 to "+14.8",
        6 to "+17.9",
        7 to "+20.3",
        8 to "+19.7",
        9 to "+15.3",
        10 to "+10.5",
        11 to "+6.0",
        12 to "+1.3"
    )

    fun getterOfBerlinTemp(month: Int): String? {
        return berlinTemp[month]
    }

    private val brusselsTemp: Map<Int, String> = mapOf(
        1 to "+3.3",
        2 to "+3.7",
        3 to "+6.8",
        4 to "+9.8",
        5 to "+13.6",
        6 to "+16.2",
        7 to "+18.4",
        8 to "+18.0",
        9 to "+14.9",
        10 to "+11.1",
        11 to "+6.8",
        12 to "+3.9"
    )

    fun getterOfBrusselsTemp(month: Int): String? {
        return brusselsTemp[month]
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

    private val lyonTemp: Map<Int, String> = mapOf(
        1 to "+3.4",
        2 to "+4.8",
        3 to "+8.4",
        4 to "+11.4",
        5 to "+15.8",
        6 to "+19.4",
        7 to "+22.1",
        8 to "+21.6",
        9 to "+17.6",
        10 to "+13.4",
        11 to "+7.5",
        12 to "+4.3"
    )

    fun getterOfLyonTemp(month: Int): String? {
        return lyonTemp[month]
    }

    private val minskTemp: Map<Int, String> = mapOf(
        1 to "-4.5",
        2 to "-4.4",
        3 to "0.0",
        4 to "+7.2",
        5 to "+13.3",
        6 to "+16.4",
        7 to "+18.5",
        8 to "+17.5",
        9 to "+12.1",
        10 to "+6.6",
        11 to "+0.6",
        12 to "-3.4"
    )

    fun getterOfMinskTemp(month: Int): String? {
        return minskTemp[month]
    }

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

    private val nicosiaTemp: Map<Int, String> = mapOf(
        1 to "+10.6",
        2 to "+10.6",
        3 to "+13.1",
        4 to "+17.1",
        5 to "+22.3",
        6 to "+26.9",
        7 to "+29.7",
        8 to "+29.4",
        9 to "+26.2",
        10 to "+22.3",
        11 to "+16.3",
        12 to "+12.0"
    )

    fun getterOfNicosiaTemp(month: Int): String? {
        return nicosiaTemp[month]
    }

    private val osloTemp: Map<Int, String> = mapOf(
        1 to "-4.3",
        2 to "-4.0",
        3 to "-0.2",
        4 to "+4.5",
        5 to "+10.8",
        6 to "+15.2",
        7 to "+16.4",
        8 to "+15.2",
        9 to "+10.8",
        10 to "+6.3",
        11 to "+0.7",
        12 to "-3.1"
    )

    fun getterOfOsloTemp(month: Int): String? {
        return osloTemp[month]
    }

    private val parisTemp: Map<Int, String> = mapOf(
        1 to "+4.9",
        2 to "+5.6",
        3 to "+8.8",
        4 to "+11.4",
        5 to "+15.1",
        6 to "+18.2",
        7 to "+20.4",
        8 to "+20.2",
        9 to "+16.9",
        10 to "+12.9",
        11 to "+8.1",
        12 to "+5.4"
    )

    fun getterOfParisTemp(month: Int): String? {
        return parisTemp[month]
    }

    private val pragueTemp: Map<Int, String> = mapOf(
        1 to "-1.4",
        2 to "-0.4",
        3 to "+3.6",
        4 to "+8.4",
        5 to "+13.4",
        6 to "+16.1",
        7 to "+18.2",
        8 to "+17.8",
        9 to "+13.5",
        10 to "+8.5",
        11 to "+3.1",
        12 to "-0.3"
    )

    fun getterOfPragueTemp(month: Int): String? {
        return pragueTemp[month]
    }

    private val sofiaTemp: Map<Int, String> = mapOf(
        1 to "-0.5",
        2 to "+1.1",
        3 to "+5.4",
        4 to "+10.6",
        5 to "+15.4",
        6 to "+18.9",
        7 to "+21.2",
        8 to "+21.0",
        9 to "+16.5",
        10 to "+11.3",
        11 to "+5.1",
        12 to "+0.7"
    )

    fun getterOfSofiaTemp(month: Int): String? {
        return sofiaTemp[month]
    }

    private val tallinnTemp: Map<Int, String> = mapOf(
        1 to "-2.9",
        2 to "-3.6",
        3 to "-0.6",
        4 to "+4.8",
        5 to "+10.2",
        6 to "+14.5",
        7 to "+17.6",
        8 to "+16.5",
        9 to "+12.0",
        10 to "+6.5",
        11 to "+2.0",
        12 to "-0.9"
    )

    fun getterOfTallinnTemp(month: Int): String? {
        return tallinnTemp[month]
    }

    private val viennaTemp: Map<Int, String> = mapOf(
        1 to "+0.3",
        2 to "+1.5",
        3 to "+5.7",
        4 to "+10.7",
        5 to "+15.7",
        6 to "+18.7",
        7 to "+20.8",
        8 to "+20.2",
        9 to "+15.4",
        10 to "+10.2",
        11 to "+5.1",
        12 to "+1.1"
    )

    fun getterOfViennaTemp(month: Int): String? {
        return viennaTemp[month]
    }

    private val warsawTemp: Map<Int, String> = mapOf(
        1 to "-1.8",
        2 to "-0.6",
        3 to "+2.8",
        4 to "+8.7",
        5 to "+14.2",
        6 to "+17.0",
        7 to "+19.2",
        8 to "+18.3",
        9 to "+13.5",
        10 to "+8.5",
        11 to "+3.3",
        12 to "-0.7"
    )

    fun getterOfWarsawTemp(month: Int): String? {
        return warsawTemp[month]
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



}
