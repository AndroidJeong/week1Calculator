package com.example.week1


class Calculator {
    fun add(a:Int, b:Int) {
        println(a+b)
    }
    fun subtract(a:Int, b:Int) {
        println(a-b)
    }
    fun divide(a:Int, b:Int) {
        println(a/b)
    }
    fun Multiply(a:Int, b:Int) {
        println(a*b)
    }
}

fun main() {

    val example = Calculator()
    example.add(2,2)
    example.subtract(2,2)
    example.divide(2,2)
    example.Multiply(2,2)
}