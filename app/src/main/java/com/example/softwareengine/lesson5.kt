package com.example.softwareengine
// kotlin collections


fun main(){

    val myList = listOf("Apple", "Banana", "Cherry")
    println(myList[0])


    val mySet = setOf("A", "B", "C", "A")
    println(mySet)

    val myMap = mapOf("id" to 101, "name" to "Dikshanta")
    println(myMap["name"])

    val fruits = listOf("Apple", "Banana", "Cherry")
    println("List: $fruits")
    println("Size: ${fruits.size}")
    println("Index of Banana: ${fruits.indexOf("Banana")}")
    println("Get element at index 1: ${fruits.get(1)}")


        val set1 = setOf("A", "B", "C")
        val set2 = setOf("C", "B", "A")
        println("Sets equal: ${set1 == set2}")



    val map1 = mapOf("id" to 1, "name" to "Dikshanta")
    val map2 = mapOf("name" to "Dikshanta", "id" to 1)
    println("Maps equal: ${map1 == map2}")


        val student = mapOf(
            "name" to "Dikshanta",
            "course" to "Kotlin",
            "year" to 2
        )
        println("Student name: ${student["name"]}")
        println("Keys: ${student.keys}")
        println("Values: ${student.values}")









}
