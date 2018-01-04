package com.kotlin.loops.forLoops

/**
 * Created by Hussain Sherwani
 * at 10:53 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */

fun main(args: Array<String>) {

//    To check simple behavior of For loop
    var sum = 0
//    for (i in 1..100) {
//        println(i)
//        sum += i
//    }
//    println("Sum is $sum")

//    If you want to Iterate for loop in reverse order we use `downTo` key word
//    and define maximum range to minimum range
    for (i in 100 downTo 1){
        println(i)
        sum += i
    }

    println("Sum is $sum")
}