package com.example.week1

class AddOperation(a:Int, b:Int) {
    fun add(a: Int, b: Int): Int {
        return a+b
    }
}

class SubstractOperation(a:Int, b:Int) {
    fun substract(a: Int, b: Int): Int {
        return a-b
    }
}

class MultiplyOperation(a:Int, b:Int) {
    fun multiply(a: Int, b: Int): Int {
        return a*b
    }
}

class DivideOperation() {
    fun divide(a: Int, b: Int): Int {
        return a/b
    }
}

class Calculation(a:Int, b: Int) {
    var plus = AddOperation(a,b).add(a, b)
    val minus = SubstractOperation(a,b).substract(a,b)
    val multiply = MultiplyOperation(a,b).multiply(a,b)
    val divide = DivideOperation().divide(a,b)

}

fun main() {
    var example = Calculation(2,2)
    println(example.plus)
    println(example.minus)
    println(example.multiply)
    println(example.divide)
}