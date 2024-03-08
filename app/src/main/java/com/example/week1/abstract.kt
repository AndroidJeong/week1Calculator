package com.example.week1

abstract class Abstract {
    abstract fun operate(num1: Double, num2: Double): Double
}

class SubstractOperation2: Abstract() {
    override fun operate(num1: Double, num2: Double): Double = (num1 - num2).toDouble()
}

class Calculator2(private val exampleClass: Abstract) {
    fun operate(num1: Double, num2: Double) {
        println(exampleClass.operate(num1, num2))
    }
}

fun main() {
    val minusCalc = Calculator2(SubstractOperation2())
    minusCalc.operate(10.0,20.0)
}