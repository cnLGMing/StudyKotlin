package com.cnlgming.kotlin.destructuring02

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * 数据类  获取数据的三种写法
 *
 */

/**
 * 数据类
 */
data class User(val name: String, val age: Int)


fun getUser(): User {
    return User("Liu Guangming", 24)
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name = ${user.name} , age = ${user.age}")

    val (name, age) = getUser()
    println("name = $name , age = $age")

    println("name = ${getUser().component1()} , age = ${getUser().component2()}")
}
