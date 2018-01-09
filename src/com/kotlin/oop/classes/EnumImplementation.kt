package com.kotlin.oop.classes

/**
 * Created by Hussain Sherwani
 * at 3:40 PM on 1/9/2018
 * hussain.ahmad5539@gmail.com .
 */
fun printEnum() {
    val currentDay : Day = Day.TUE

    for (d : Day in Day.values()) {
        println("Day: $d")
    }
    println("Current Day: $currentDay")
    when (currentDay) {
        Day.MON, Day.TUE, Day.WED, Day.THUR, Day.FRI -> println("Weekday")
        Day.SAT, Day.SUN -> println("Weekend")
    }
}

fun main(args: Array<String>) {
    printEnum()
}

