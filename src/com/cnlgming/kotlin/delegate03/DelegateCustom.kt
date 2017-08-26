package com.cnlgming.kotlin.delegate03

import kotlin.reflect.KProperty


/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * 自定义委托
 *
 */


class Example {
    var p: String by CustomDelegate()

    override fun toString(): String {
        return "Example Class"
    }
}


/**
 * 自定义 委托类
 */
class CustomDelegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating ${prop.name} to me "
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val example = Example()
    println(example.p)
    example.p = "new"
    println(example.p)
}