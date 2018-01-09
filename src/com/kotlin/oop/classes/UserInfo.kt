package com.kotlin.oop.classes

/**
 * Created by Hussain Sherwani
 * at 10:17 AM on 1/9/2018
 * hussain.ahmad5539@gmail.com .
 */
class UserInfo {
    var name: String = "Hussain"
    var age: Int = 23
    fun speak() {
        println("Hellow")
    }

    fun great(name: String) {
        println(name)
        println("Hello $name!")
    }

    fun greats(name: String, age: Int) {
        println(name)
        println("Hello $name! , your age is $age")
    }
//    fun getYearOfBirth(age: Int):Int{
//        return 2017-age
//    }

    //    we can also use funcation like this.
    fun getYearOfBirth() = 2016 - age
}

fun main(args: Array<String>) {
    val person = UserInfo()

    println(person.name)
    println(person.age)
    println(person.getYearOfBirth())
//    println(person.getYearOfBirth(23))
    person.speak()
    person.great("Zubair")
    person.greats("Hussain", 23)
    person.name = "Ibrahim"
    person.age = 18

    println(person.name)
    print(person.age)
}