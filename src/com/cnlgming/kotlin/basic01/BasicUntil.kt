package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * until 关键字
 */

fun main(args: Array<String>) {
    // 闭区间[0,5]
    for (x in 0..5) {
        print("$x") //012345
    }

    println()

    // 开区间[0,5)
    for (x in 0 until 5) {
        print("$x") //01234
    }
}
