package com.cnlgming.kotlin.delegate03

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * Lazy 延迟加载
 *  第一次调用时,进行初始化操作...线程安全的
 *
 */

class LazySimple {
    val test: String by lazy {
        println("初始化完成...")
        "延迟加载"
    }
}

fun main(args: Array<String>) {
    val simple = LazySimple()
    println("simple = ${simple.test}")
    println("simple = ${simple.test}")
    /*
        初始化完成...
        simple = 延迟加载
        simple = 延迟加载
     */
}

