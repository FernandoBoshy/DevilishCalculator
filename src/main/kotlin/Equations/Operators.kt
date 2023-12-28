package Equations

import kotlin.random.Random

class Operators(number1: Int, number2: Int, result: Int) {
    var result = 0
    var number1 = 0
    var number2 = 0


    fun adition(): ArrayList<Int>{
        var list: ArrayList<Int> = ArrayList()
        result = (0..9).random()
        number1 = (0..result).random()
        number2 = result - number1
        list.add(number1)
        list.add(number2)
        list.add(result)
        return list
    }
    fun subtraction(): ArrayList<Int>{
        var list: ArrayList<Int> = ArrayList()
        result = (0..9).random()
        number1 = (result..9).random()
        number2 = number1 - result
        list.add(number1)
        list.add(number2)
        list.add(result)
        return list
    }
}

fun isEven(x: Int): Boolean {
    if (x % 2 == 0)
        return true
    else{
        return false
    }
}