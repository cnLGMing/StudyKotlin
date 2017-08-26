package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * 引用必须被明确标记为可以为空，以便能够保留一个null。
 */
fun main(args: Array<String>) {
    val x = parseInt("10")
    val y = parseInt("20a")

    if (x != null && y != null) {
        println("$x + $y = " + (x + y))
    } else {
        println("不是 Int 类型")
    }
}

/**
 * ? 表示可以为空
 */
fun parseInt(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        println("$str 不能转换为 Int 类型")
    }
    return null
}
