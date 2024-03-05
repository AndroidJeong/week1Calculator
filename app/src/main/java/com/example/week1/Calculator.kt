package com.example.week1


class Calculator {

    fun calculate() {
        var num1 = 0
        var num2 = 0
        var input = ""
        var cal = ""

        while (input != "1") {
            println("계산하고 싶은 첫번째 숫자:")
            num1 = readLine()!!.toInt()
            println("계산하고 싶은 두번째 숫자:")
            num2 = readLine()!!.toInt()
            println("덧셈은 1, 뺄셈은 2, 곱셈은 3, 나눗셈은 4, 나머지 연산은 5를 입력해주세요.")
            cal = readLine()!!

            when (cal) {
                "1" -> add(num1, num2)
                "2" -> subtract(num1, num2)
                "3" -> multiply(num1, num2)
                "4" -> divide(num1, num2)
                "5" -> remainder(num1, num2)
                else -> println("잘못된 숫자를 입력하셨습니다.")
            }

            println("계산을 그만하시고 싶으시면 1을 입력해주세요. 계속하려면 엔터를 눌러주세요.")
            input = readLine()!!


        }


    }

    fun add(a:Int, b:Int) {
        println(a+b)
    }
    fun subtract(a:Int, b:Int) {
        println(a-b)
    }
    fun divide(a:Int, b:Int) {
        println(a/b)
    }
    fun multiply(a:Int, b:Int) {
        println(a*b)
    }
    fun remainder(a:Int, b:Int) {
        println(a%b)
    }

}

fun main() {

    val example = Calculator()
    example.calculate()


}