package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * 检查一个数字是否超出范围。检查一个集合是否包含一个对象。
 *
 */

fun main(args: Array<String>) {

    /* 检查一个数字是否超出范围。 */

    val x = 1;
    // 检查一个数是否在某个范围内
    if (x in 1..5) {
        println("$x 在此范围内")
    }

    // 遍历一个范围, 闭区间[1,10]
    for (a in 1..10) {
        print("$a ")   //1 2 3 4 5 6 7 8 9 10
    }

    println()

    // 遍历一个范围,开区间 [1,10)
    for (a in 1 until 10) {
        print("$a ")   //1 2 3 4 5 6 7 8 9
    }

    println("\n")

    /* 检查一个集合是否包含一个对象。 */
    val y = 5
    val list = arrayListOf<String>()
    list.add("hehe")
    list.add("haha")
    list.add("heihei")

    if (y !in 0 until list.size) {
        println("此集合只有 ${list.size} 个元素. 而 y = $y")
    }

    if ("hehe" in list) {
        println("list 集合中包含了 hehe")
    }

    if ("biubiu" in list) {
        println("list 集合中包含了 biubiu")
    } else {
        println("list 集合中不包含了 biubiu")
    }


}