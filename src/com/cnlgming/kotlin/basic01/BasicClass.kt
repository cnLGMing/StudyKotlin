package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * 创建类, 对象...不需要 new 关键字就能创建对象
 */

class Person(var name: String) {
    fun say() {
        println("我的名字是 $name")
    }
}

fun main(args: Array<String>) {
    Person("Liu Guangming").say()
}