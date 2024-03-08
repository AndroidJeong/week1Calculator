package com.example.week1

import java.util.Stack


class MyStack {
    fun getPostFixExpressionOperation(originalExpression: String): Int {
        val stack = Stack<String>()
        val arr = strToArr(originalExpression)
        var result = ""
        //"(2 + 4) * 4 / 2 * 12"
        for(e in arr) {
            when(e) {
                "+", "-", "*", "/" -> {
                    while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(e)) {
                        result += stack.pop() + " "
                    }
                    stack.push(e)
                }
                "(" -> {
                    stack.push(e)
                }
                ")" -> {
                    while(stack.peek() != "(") {
                        result += stack.pop() + " "
                    }
                    stack.pop() // "(" 제거
                }
                else -> {
                    result += "$e "
                }
            }
        }

        while(!stack.isEmpty()) {
            result += stack.pop() + " "
        }

        println("---최종---")
        println("후위표기법: $result")

        val realResult = finalCalc(result)
        println("결과: $realResult")
        return realResult
    }

    fun finalCalc(result: String): Int {
        val stack = Stack<String>()
        val calResult = result.split(" ")
        var result = 0

        for(e in calResult) {
            when(e) {
                "+" -> {
                    result = stack.pop().toInt() + stack.pop().toInt()
                    stack.push(result.toString())
                }
                "-" -> {
                    result = -stack.pop().toInt() + stack.pop().toInt()
                    stack.push(result.toString())
                }
                "*" -> {
                    result = stack.pop().toInt() * stack.pop().toInt()
                    stack.push(result.toString())
                }
                "/" -> {
                    val num2 = stack.pop().toInt()
                    val num1 = stack.pop().toInt()
                    result = num1 / num2
                    stack.push(result.toString())
                }
                else -> {
                    stack.push(e)
                }
            }
        }
        return result
    }

    fun strToArr(str: String): Array<String> {
        var tempStr = str.replace("(", "( ")
        tempStr = tempStr.replace(")", " )")
        return tempStr.split(" ").toTypedArray()
    }

    //연산자의 우선순위를 파악
    fun precedence(operator: String): Int {
        return when(operator) {
            "+", "-" -> 1
            "*", "/" -> 2
            else -> 0
        }
    }
}

fun main() {
    val myStack = MyStack()
    val calResult = myStack.getPostFixExpressionOperation("(2 + 4) * 4 / 2 * 12")
    println("결과: ${calResult}입니다")
}