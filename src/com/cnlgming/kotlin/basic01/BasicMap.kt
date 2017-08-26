package com.cnlgming.kotlin.basic01

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * Map
 */

fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)
    map.put("three", 3)

    for ((key, value) in map) {
        println("key = $key , value = $value")
    }

}
