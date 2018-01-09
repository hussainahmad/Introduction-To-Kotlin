package com.kotlin.oop.classes

/**
 * Created by Hussain Sherwani
 * at 10:42 AM on 1/9/2018
 * hussain.ahmad5539@gmail.com .
 */
class ConstructorWitIInitBlock(val name: String, var age: Int) {
    //    val personName: String = name
    var personAge: Int = age

    init {
        println("Object Is created")
    }

    fun speak() {
        println("Hello Word..!")
    }

    fun great(name: String) {
        println("Hello $name..!")
    }

    fun getYearOfBirth() = 2018 - personAge

}
fun main(args: Array<String>) {

    val person = ConstructorWitIInitBlock("Hussain", 24)
    person.speak()
    person.great("Hussain")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}

