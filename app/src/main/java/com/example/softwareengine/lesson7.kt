package com.example.softwareengine

fun main() {
    val number = 10
    if (number > 0) {
        println("Positive number")
    } else if (number < 0) {
        println("Negative number")
    } else {
        println("Zero")
    }

    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6, 7 -> println("Weekend")
        else -> println("Invalid day")
    }

    for (i in 1..5) {
        println("for loop: $i")
    }

    val list = listOf("Kotlin", "Java", "Python")
    list.forEach { language ->
        println("forEach: $language")
    }

    var count = 1
    while (count <= 3) {
        println("while loop: $count")
        count++
    }

    var index = 1
    do {
        println("do-while loop: $index")
        index++
    } while (index <= 3)
}
