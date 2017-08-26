package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * `if` 是一个表达式，即它返回一个值。所以没有三元运算符（condition？then：else）
 */
fun main(args: Array<String>) {
    println(max(10, 11))
}

fun max(x: Int, y: Int) = if (x > y) x else y