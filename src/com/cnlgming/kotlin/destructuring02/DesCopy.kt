package com.cnlgming.kotlin.destructuring02

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * copy 关键字
 *
 */

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val lgm = Person("LGM", 24)
    println(lgm)

    val lgm2 = Person("LGM", 24)
    val lgm3 = Person("cnlgming", 25)

    println("lgm == lgm2: ${lgm == lgm2}")  // true
    println("lgm == lgm3: ${lgm == lgm3}")  // false

    // copy 函数
    val lgmCopy = lgm.copy()
    println(lgmCopy)
    println(lgm.copy("lgming"))
    println(lgm.copy(age = 22))
    println(lgm.copy("Liu Guangming", 23))

}
