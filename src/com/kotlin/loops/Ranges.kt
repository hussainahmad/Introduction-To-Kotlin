package com.kotlin.loops

/**
 * Created by Hussain Sherwani
 * at 11:51 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    Range expressions are formed with rangeTo functions that have the operator form ..
//    which is complemented by in and !in. Range is defined for any comparable type,
//    but for integral primitive types it has an optimized implementation. Here are some examples of using ranges:
    for (i in 100 downTo 1 step 5) {
        println(i)
    }
}
