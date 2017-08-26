package com.cnlgming.kotlin.destructuring02

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * Destructuring 解构声明
 */

fun main(args: Array<String>) {
    val pair = Pair(1, "one")

    // 一一解析
    val (name, value) = pair
    println("name = $name , value = $value")

    // 占位符解析...如果在解构声明中你不需要某个变量，那么可以用下划线取代其名称
    val (_, value2) = pair
    println("value2 = $value2")


}


class Pair<K, V>(val first: K, val second: V) {
    // componentN() 函数需要用 operator 关键字标记，以允许在解构声明中使用它们。

    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}
