package com.example.softwareengine

fun greet() {
    println("Hello, Kotlin")
}

fun welcome() {
    println("Welcome to Android")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(x: Int, y: Int): Int {
    return x * y
}

val square: (Int) -> Int = { it * it }

val greetLambda = { println("Hi from lambda!") }

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun showMessage(message: () -> Unit) {
    message()
}

fun String.reverse(): String {
    return this.reversed()
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}

fun sumUntil(n: Int): Int {
    if (n <= 1) return n
    return n + sumUntil(n - 1)
}

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

    greet()
    welcome()

    println(add(5, 10))
    println(multiply(4, 6))

    println(square(7))
    greetLambda()

    println(operate(10, 5) { a, b -> a - b })
    showMessage { println("Hello from higher-order") }

    println("kotlin".reverse())
    println(8.isEven())

    println(factorial(5))
    println(sumUntil(4))
}
