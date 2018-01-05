package com.kotlin.collection

/**
 * Created by Hussain Sherwani
 * at 1:09 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    Array list are mutable while array are immutable we cannot change their size
    val arrayList : ArrayList<String> = arrayListOf("My", "Name ", "Is")  //arrayList are immutable , you can change the content
    arrayList.add("Hussain")
    println(arrayList[3])


//    When we concatenate tow ArrayList it become List instead of ArrayList
    val list : ArrayList<String>  = arrayListOf("Ahmad", "Khan")
    val mix : List<String> = arrayList + list
    println(mix.size)
    println(mix.contains("Hussain"))
    println(mix.isEmpty())
//    As List are immutable we can add or remove its value
//    mix.add give error
//    mix.remove give error

//    /// Difference between ArrayList and array....... we can change the size of an ArrayList but not Array... Arrays has always fixed size

    list.add("Bilal")
    list.add(0, "Hussain")
    println(list)

//    Using contains method
    println(list.contains("Zubair"))
    list.add("Usama")
//    we can also add value in a special index
    list.add(1, "khan")
    println(list)
//
    val remove : Boolean = list.remove("Usama khan")
    println(remove)
    println(list)
    val sublist = list.subList(0, 3)  //Returns a view of the portion of this
    // list between the specified fromIndex (inclusive) and toIndex (exclusive).
    println(sublist)
}