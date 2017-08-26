package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * for 循环
 */
fun main(args: Array<String>) {
    val names = arrayOf("Android", "Java", "Kotlin")

    // for in 循环
    for (name in names) {
        println("name: $name")
    }

    println("--------------")
    for (index in names.indices) {
        println("name: ${names[index]}")
    }
}