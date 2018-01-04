package com.kotlin.conditions

import java.util.*

/**
 * Created by Hussain Sherwani
 * at 1:02 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {
    val random = Random().nextInt(50)
    when (random) {
        in 1..10 -> println("Random number is between one an ten")
        in 11..20 -> println("Random number is between eleven an twenty")
        in 21..30 -> println("Random number is between twenty one an thirty")
        in 31..40 -> println("Random number is between thirty one an forty")
        in 41..50 -> println("Random number is between forty one an fifty")
    }
}