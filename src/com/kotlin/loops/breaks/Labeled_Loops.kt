package com.kotlin.loops.breaks

/**
 * Created by Hussain Sherwani
 * at 11:32 AM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    Labeled break in kotlin is mostly used with if statement. An identifier followed by the @ sign is called label.
//     For example, @first, @second, @outer, @inner etc. are some valid labels.
//     In kotlin, you may use label with any expression. You just need to write label in front of it.

//    for (i in 1..10) {
//        for (j in 1..10) {
//            if (i - j == 5) {
//                break
//            }
//            println("$i - $j")
//        }
//    }
//     As I use outer and inner we can also use first, second and third.
    outer@ for (i in 1..10) {
        inner@ for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }

}