package com.kotlin.funcations

import java.util.*

/**
 * Created by Hussain Sherwani
 * at 5:01 PM on 1/5/2018
 * hussain.ahmad5539@gmail.com .
 */
//No para meter , no return value
fun helloWord(){
    println("Hello Word..!")
}

// parameter , but no return value
fun printWhiteSpace(text: String){
    for(char in text){
        println(char + "")
    }
    println()
}
//no parameter but return value
fun getCurrentDate(): Date {
    return Date()

}
// parameter also return value
fun max(a: Int, b:Int): Int{
    if(a>=b){
        return a
    }
    else{
        return b
    }
}

fun main(args: Array<String>) {
    helloWord()
    printWhiteSpace("Kotlin White Space")
    println(getCurrentDate())
    println(max(9489,8474))
}

