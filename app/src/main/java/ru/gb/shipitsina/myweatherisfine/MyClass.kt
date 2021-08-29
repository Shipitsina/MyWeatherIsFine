package ru.gb.shipitsina.myweatherisfine

fun main() {
    //Вывести значения из разных циклов в консоль, используя примеры из методических материалов.

    for (i in 1..10) {
        println(i)
    }
    var count: Int = 0
    while (count < 10) {
        count += 1
        println(count)
    }

    val weatherList: List<Weather>
    for(weather in weatherList) {
        print(weather.town)
    }
}