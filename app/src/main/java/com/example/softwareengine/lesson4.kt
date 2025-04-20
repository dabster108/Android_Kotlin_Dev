package com.example.softwareengine

fun main(args: Array<String>){
    var age = arrayOf(1,2,3)
    println(age)

    println(" First element " + age[0])
    println(" Second element " + age[1])
    println("Third element " + age[2])


    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)


    var name = arrayListOf<String>("sandish", "pratyush", "ram")
    name.add("hari")
    name.add(4,"Sita")
    println(name)


  var mixlist = arrayListOf<Any>("hello", 2 ,4 ,5)
    println(mixlist[0]);
    println(mixlist[2])



}