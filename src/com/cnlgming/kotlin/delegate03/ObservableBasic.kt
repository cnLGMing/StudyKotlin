package com.cnlgming.kotlin.delegate03

import kotlin.properties.Delegates

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * 可观察属性
 *
 */

class User {
    var name: String by Delegates.observable("no name") { d, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Kotlin"
    user.name = "Android"

//    no name -> Kotlin
//    Kotlin -> Android
}
