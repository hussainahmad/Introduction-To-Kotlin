package com.kotlin.loops

/**
 * Created by Hussain Sherwani
 * at 11:29 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {
    val list = listOf<String>("Book", "Table", "Laptop")
    for (str in list) {
        if (!str.contains('o')) {
            continue
        }
        // Here there is three strings in a list, two of them contains `o`, so these two strings will print
        println(str)
    }
}