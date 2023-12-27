package Equations

import kotlin.random.Random

class Operators(number1: Int, number2: Int, result: Int) {
    var result = 0
    var number1 = 0
    var number2 = 0


    fun adition(){
        result = (0..9).random()
        number1 = (0..result).random()
        number2 = result - number1
        println("$number1 + $number2 = $result")
    }
    fun subtraction(){
        result = (0..9).random()
        number1 = (0..result).random()
        number2 = result + number1
        println("$number1 - $number2 = $result")

    }
}