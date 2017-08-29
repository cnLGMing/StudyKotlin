package com.cnlgming.kotlin.unittest

/**
 * Created by Liu Guangming on 2017-08-29.
 */


fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty()) return null
    var max = 0
    var temp = 0
    for (index in a.indices) {
        if (index == 0) {
            temp = a[index]
            max = 0
        } else {
            if (temp <= a[index]) {
                temp = a[index]
                max = index
            }
        }
    }

    return max
}