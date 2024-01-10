package Equations

import kotlin.random.Random

class Operators(number1: Int, number2: Int, result: Int, id: Int) {
    var result = 0
    var number1 = 0
    var number2 = 0
    var id = 0

    fun adition(): ArrayList<Int>{
        id = 0
        var list: ArrayList<Int> = ArrayList()
        result = (0..9).random()
        number1 = (0..result).random()
        number2 = result - number1
        list.add(number1)
        list.add(number2)
        list.add(result)
        list.add(id)

        return list
    }
    fun subtraction(): ArrayList<Int>{
        id = 1
        var list: ArrayList<Int> = ArrayList()
        result = (0..9).random()
        number1 = (result..9).random()
        number2 = number1 - result
        list.add(number1)
        list.add(number2)
        list.add(result)
        list.add(id)

        return list
    }
}