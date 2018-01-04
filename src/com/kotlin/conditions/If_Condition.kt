package com.kotlin.conditions

/**
 * Created by Hussain Sherwani
 * at 12:34 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {
    val age: Int = 42
    if (age < 18) {
        print("You can not register")
    } else if (age < 20) {
        print("You should not register")
    } else if (age < 30) {
        print("You should  be able register")
    } else if (age < 40) {
        print("You can register")
    } else {
        print("You can not register easily")
    }
}