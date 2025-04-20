package com.example.softwareengine

fun main() {
    println("hello world")

    var firstname = "pratyush"
    var lastname = "giri"

    println(firstname + " " + lastname)
    println("${firstname.length} $lastname") // interpolation

    // var mutable and val means immutable
    var name: String = "sandish"
    val age: Int = 10

    var address = arrayOf("ktm", "pokhara", "Bhaktapur") // static
    // we can add in arraylist not in array
    address[1] = "helo"
    // Print array contents properly
    println(address.contentToString())

    var names = arrayListOf("ktm", "chitwan") // dynamic arraylist
    names.add("pokhara")
    println(names)

    var data = ArrayList<Any>()
    data.add(1)
    data.add(2)
    data.add("ram")
    println(data)

    var dictionary = mapOf(
        "Apple" to "This is a fruit"
    )
    println(dictionary["Apple"])
}
