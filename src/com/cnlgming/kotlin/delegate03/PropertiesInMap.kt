package com.cnlgming.kotlin.delegate03

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * Map
 */

class Student(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val student = Student(mapOf(
            "name" to "Liu Guangming",
            "age" to 24
    ))

    println("name = ${student.name} , age = ${student.age}")
}
