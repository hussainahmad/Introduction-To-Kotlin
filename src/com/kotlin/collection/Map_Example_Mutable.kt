package com.kotlin.collection

/**
 * Created by Hussain Sherwani
 * at 1:10 PM on 1/3/2018
 * hussain.ahmad5539@gmail.com .
 */
fun main(args: Array<String>) {

//    Kotlin also support mutability in map, to make immutable map we declare with `mutableMapOf`
        val countryToInhabitant = mutableMapOf("Pakistan" to +92, "USA" to +1)
        countryToInhabitant.put("India", 91)
        countryToInhabitant.putIfAbsent("Germany", +5)
        countryToInhabitant.putIfAbsent("USA", +1)  // it check on basis of KEY not on
        // basis of value if you want to override use"put"
        println(countryToInhabitant)
//    countryToInhabitant.containsKey()
//    countryToInhabitant.contains("USA")
//    countryToInhabitant.containsValue()
        println(countryToInhabitant.get("USA"))
        println(countryToInhabitant.getOrDefault("USA", +1))

}