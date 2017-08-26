package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-25.
 *
 * is 关键字: 是否是此类型的实例
 */


fun main(args: Array<String>) {
    println(getStringLength("10000"))
    println(getStringLength("10000")!!.toInt())   //  !! 不管返回是否为null, 都会执行后面的语句

    println("? --" + getStringLength(1)?.toLong())   // ? 如果返回为null, 则不执行 ? 后面的语句
    println("!! --" + getStringLength(1)!!.toInt())   //  !! 不管返回是否为null, 都会执行后面的语句
}


fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}