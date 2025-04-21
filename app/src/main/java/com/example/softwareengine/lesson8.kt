fun greet() = println("Hello, Kotlin")

fun welcome() = println("Welcome to Android")

fun add(a: Int, b: Int): Int = a + b

fun multiply(x: Int, y: Int): Int = x * y

val square: (Int) -> Int = { it * it }

val greetLambda = { println("Hi from lambda!") }

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int = operation(a, b)

fun showMessage(message: () -> Unit) = message()

fun String.reverse(): String = this.reversed()

fun Int.isEven(): Boolean = this % 2 == 0

fun factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

fun sumUntil(n: Int): Int = if (n <= 1) n else n + sumUntil(n - 1)

fun main() {
    val number = 10
    println(if (number > 0) "Positive number" else if (number < 0) "Negative number" else "Zero")

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

    for (i in 1..5) println("for loop: $i")

    listOf("Kotlin", "Java", "Python").forEach { println("forEach: $it") }

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

    println("Addition: ${add(5, 10)}")
    println("Multiplication: ${multiply(4, 6)}")

    println("Square: ${square(7)}")
    greetLambda()

    println("Operate with subtraction: ${operate(10, 5) { a, b -> a - b }}")
    showMessage { println("Hello from higher-order") }

    println("Reversed string: ${"kotlin".reverse()}")
    println("Is 8 even? ${8.isEven()}")

    println("Factorial of 5: ${factorial(5)}")
    println("Sum until 4: ${sumUntil(4)}")
}
