package com.kotlin.collection

/**
 * Created by Hussain Sherwani
 * at 10:13 AM on 1/4/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {
    //    this is immutable map , we can not change its value.
    val nametoAges: Map<String, Int> = mapOf(Pair("hussain", 24), Pair("Ibrahim", 18))
    val nametoAges1: Map<String, Int> = mapOf(
            "hussain" to 24,
            "Ibrahim" to 18)

    println(nametoAges === nametoAges1)
//    println(nametoAges.keys)
//    println(nametoAges.values)
//    println(nametoAges.entries)
    nametoAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}