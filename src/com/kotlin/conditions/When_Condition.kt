package com.kotlin.conditions

/**
 * Created by Hussain Sherwani
 * at 12:37 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    To use Switch statement in kotlin we use `when` keyword
//    val mod: Int = 6
//    when (mod) {
//        1 -> println("The mode is lazy")
//        2 -> {
//            println("The mode is 2")
//            println("so the mode is busy")
//        }
//        3 -> println("The mode is super productive")
//        else -> println("I don't know what the fuck mode is now")
//    }
//
        val x = 10
    when(x){
        5-> println("X is 5")
        3*12 -> println("3 *12")
        "Hey there ".length -> println("X is the length of string'Hey There'")
        in 1..10 -> println("X is between one and 10")
        in 11..20 -> println("X is between 11 and 20")
        in 21..30 -> println("X is between 21 and 30")
        !in 1..9 -> println("X is not in 1 to 9")
    }
}