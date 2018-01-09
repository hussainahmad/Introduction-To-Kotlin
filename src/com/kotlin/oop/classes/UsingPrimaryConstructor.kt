package com.kotlin.oop.classes

/**
 * Created by Hussain Sherwani
 * at 10:20 AM on 1/9/2018
 * hussain.ahmad5539@gmail.com .
 */

class UsingPrimaryConstructor(val firstName: String, var age: Int) {
//    Here the block of code surrounded by parenthesis is the primary constructor.
//    the constructor of this class defined two parameter one is name which is read only
//    and other is age we can override this value

}

fun main(args: Array<String>) {

    val person1 = UsingPrimaryConstructor("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}

