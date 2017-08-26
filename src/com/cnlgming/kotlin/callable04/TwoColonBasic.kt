package com.cnlgming.kotlin.callable04

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * :: Kotlin 中 双冒号操作符 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法。
 */

fun isOdd(x: Int) = x % 2 != 0

fun main(args: Array<String>) {
    val nums = listOf(1, 2, 3)

    // filter 过滤器
    println(nums.filter(::isOdd))   //[1, 3]

}
