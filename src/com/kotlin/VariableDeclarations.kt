package com.kotlin

/**
 * Created by Hussain Sherwani
 * at 11:05 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
var a : Int = 500
val b : Int = 600
fun main(args: Array<String>) {

    // as we declare a is `var` so this is mutable we can change the value
    a=700
    // As variable b is declared with `val` so this is immutable and its value cannot change ... bellowed line give compile time error
//    b=800
    println("value of A is $a and value of B is $b")
}