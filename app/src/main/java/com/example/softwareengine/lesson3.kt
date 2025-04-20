package com.example.softwareengine

fun main() {
    val name = "Dikshanta"
    println(name)

    var age = 20
    println(age)

    val isStudent = true
    println(isStudent)

    val grade = 'A'
    println(grade)

    val height = 5.9f
    println(height)

    val number: Int = 100
    println(number)

    val numberDouble: Double = number.toDouble()
    println(numberDouble)

    val str = "123"
    println(str)

    val strToInt = str.toInt()
    println(strToInt)

    val doubleValue: Double = 45.67
    println(doubleValue)

    val doubleToInt: Int = doubleValue.toInt()
    println(doubleToInt)

    val num = 75
    println(num)

    val numToString: String = num.toString()
    println(numToString)

    val firstName = "Dikshanta"
    println(firstName)

    val lastName = "Chapagain"
    println(lastName)

    val fullName = "$firstName $lastName"
    println(fullName)

    val message = "Hello, Kotlin!"
    println(message)
    println(message.length)
    println(message.uppercase())
    println(message.lowercase())
    println(message.contains("K"))
}

