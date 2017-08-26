package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * when 关键字
 */


fun main(args: Array<String>) {
    var num = 5

    when (num) {
        1 -> println("一")
        2 -> println("二")
        3 -> println("三")
        4 -> println("四")
        else -> println("不知道")
    }

    num = 1
    println(when (num) {
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        else -> "不知道"
    })

    cases(1)
    cases("hello")
    cases(1L)
    cases(MyClass())
    cases("kotlin")

}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("一")
        "hello" -> println("say hello")
        is Long -> println("$obj is long type")
        !is String -> println("$obj is not a String")
        else -> println("不知道")
    }
}

class MyClass() {

}