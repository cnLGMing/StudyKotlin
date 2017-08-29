package com.cnlgming.kotlin.callable04

/**
 * Created by Liu Guangming on 2017-08-26.
 *
 * 组合函数  反射
 */

fun isOdd1(x: Int) = x % 2 != 0

fun lengths(s: String) = s.length

fun isEven(x: Int) = x % 2 == 0

fun hasA(x: String) = x.contains("a")

fun hasB(x: String) = x.contains("b")


fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
    /**
    因为
    f: (B) -> C     数学表达式: f(B)=C
    g: (A) -> B     数学表达式: g(A)=B
    h(A) -> C       数学表达式: h(A)=C
    所以
    h(A)=f(B)=f(g(A))=C

    compose(::isOdd1, ::lengths)
    相当于, isOdd1(lengths(x))  得到的结果再返回给 oddlength
     */
}

fun <W, X, Y, Z> compose2(h: (Y) -> Z, f: (X) -> Y, g: (W) -> X): (W) -> Z {
    return { x -> h(f(g(x))) }
    /**
    因为
    h: (Y) -> Z     数学表达式: h(Y)=Z
    f: (X) -> Y     数学表达式: f(X)=Y
    g: (W) -> X     数学表达式: g(W)=X
    i: (W) -> Z     数学表达式: i(W)=Z
    所以 h(Y)=h(f(X))=h(f(g(W)))
     */

}


fun main(args: Array<String>) {
    // 使用 :: 操作符, 将一个函数作为值传递, 传给另一个函数
    val oddLength = compose(::isOdd1, ::lengths)
    val strings = listOf<String>("a", "ab", "abc", "abcd")
    println(strings.filter(oddLength))  // [a, abc]

    println(strings.filter(::hasA))     //[a, ab, abc, abcd]
    println(strings.filter(::hasB))     //[ab, abc, abcd]

    val hasBStrings = strings.filter(::hasB)
    println(hasBStrings)                //[ab, abc, abcd]
    val evenLength = compose(::isEven, ::lengths)
    println(hasBStrings.filter(evenLength))     //[ab, abcd]

}