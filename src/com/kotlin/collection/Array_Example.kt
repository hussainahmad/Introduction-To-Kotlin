package com.kotlin.collection

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by Hussain Sherwani
 * at 1:10 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    To declare array in kotlin
//    Array in kotlin are immutable we can not add or remove
    val mixed : Array<String> = arrayOf("I", "Love", "Kotlin", "Development")
    println(mixed[0])
//    to update the value in specific index
    mixed[3] = "Learning Kotlin"
    println(mixed[3])

    // In kotlin string also save in Array like java(JAVA: string is the array of character)
//    val str = "Udemy"
//    println(str[0])

    // How to concatenate array
    val state = arrayOf("Kotlin", "Developer")
    val allState = mixed + state

    // to get size of array
    println(allState.size)

    // to use Contain method
    if (allState.contains("Hussain")) {
        println("It contain the following String")
    } else {
        println("It doesn't contain the following Strings")
    }

//    To check is array is empty or not isEmpty and isNotEmpty ?
    val empty: Boolean = allState.isNotEmpty()
    println(empty)

}