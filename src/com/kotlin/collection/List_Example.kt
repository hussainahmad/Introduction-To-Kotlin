package com.kotlin.collection

/**
 * Created by Hussain Sherwani
 * at 1:09 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    list in kotlin are by default immutable we can not change their values. but we make mutable with MutableList
        val list : List<String> = listOf("Orange", "Apple", "Banana")   // listof() are immutable  lis , you can not change the content
//    list.add("Mango")  //give error because this is mutable its content can not change
    println(list.size)
    println(list.contains("Apple"))

}