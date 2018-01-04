package com.kotlin.loops.breaks

/**
 * Created by Hussain Sherwani
 * at 11:27 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {
    for (c in "Python") {
        if (c == 'o') {
            break
        }
        println(c)
    }
}