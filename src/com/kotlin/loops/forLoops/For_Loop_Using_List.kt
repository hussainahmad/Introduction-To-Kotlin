package com.kotlin.loops.forLoops

/**
 * Created by Hussain Sherwani
 * at 11:16 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

    val list = listOf<String>("Java", "Kotlin", "Python")
    for (element in list) {
        println(element)
    }

//    We can also get index and value using for loop in Kotlin using withIndex()
    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }
}