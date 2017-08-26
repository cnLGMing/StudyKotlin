package com.cnlgming.kotlin.delegate03

import kotlin.properties.Delegates

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * notnull 关键字
 */

class Person {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val person = Person()
    // java.lang.IllegalStateException: Property name should be initialized before get.
    // println(person.name)
    person.init("Kotlin")
    println(person.name)
}
