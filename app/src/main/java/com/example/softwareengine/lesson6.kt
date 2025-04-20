package com.example.softwareengine

fun main() {

    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double


    result = num1 + num2
    println("Addition: Result is $result")

    result = num1 - num2
    println("Subtraction: Result is $result")

    result = num1 / num2
    println("Division: Result is $result")

    result = num1 % num2
    println("Modulus: Result is $result")

    result = num1 * num2
    println("Multiplication: Result is $result")


    var a = 5
    println("Unary minus: ${-a}")
    println("Unary plus: ${+a}")
    println("Increment: ${++a}")
    println("Decrement: ${--a}")


    println("num1 == num2: ${num1 == num2}")
    println("num1 != num2: ${num1 != num2}")
    println("num1 > num2: ${num1 > num2}")
    println("num1 < num2: ${num1 < num2}")
    println("num1 >= num2: ${num1 >= num2}")
    println("num1 <= num2: ${num1 <= num2}")


    val isTrue = true
    val isFalse = false
    println("isTrue && isFalse: ${isTrue && isFalse}")
    println("isTrue || isFalse: ${isTrue || isFalse}")
    println("!isTrue: ${!isTrue}")


    val bodmas = 10 + 2 * 3 - (4 / 2)
    println("BODMAS Result: $bodmas")


    val range = 1..10
    val check = 5
    println("$check in range: ${check in range}")
    println("range contains 15: ${15 in range}")
}
