package com.dee.features

/**
 * Created by Hein Htet
 */

fun emptyFunc() {}
@Suppress("EmptyFunctionBlock")
fun emptyFuncWithSuppress() {}

fun complexFun(
    params1: String,
    params2: String,
    params3: String,
    params4: String,
    params5: String,
    params6: String,
    params7: String,
    params8: String,
) {
    println(listOf(params1, params2, params3, params4, params5, params6, params7, params8))
}

fun performanceReport() {
    val numberStart = 1
    val numberEnd = 10999999
    (numberStart..numberEnd).forEach { number ->
        println("$number")
    }
}

fun exception(e: Exception) {
    when (e) {
        is NumberFormatException -> {}
        is IndexOutOfBoundsException -> {}
        else -> throw Exception(message = "MESSAGE")
    }
}
