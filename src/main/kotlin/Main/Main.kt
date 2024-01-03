package Main

import Equations.Operators
import java.lang.NumberFormatException

var gamestart = GameStart()

fun main(args: Array<String>) {
    while (true){

        var equationList = sortEquations()
        var level: Int = chooseLevel()

        when(level){
            0 ->    break
            1, 2, 3, 4, 5 -> gamestart.startGame(level, equationList)
            else -> println("invalid. . .")
        }
    }
}

fun chooseLevel(): Int {
    var level: Int = 1
    println("Choose the difficult number:")
    println("> 0 < = Exit")
    println("> 1 < = Very Easy")
    println("> 2 < = Easy")
    println("> 3 < = Normal")
    println("> 4 < = Hard")
    println("> 5 < = Very Hard")
    print("> ")

    level = intValidation(readln())

    return level
}

fun intValidation(value: String): Int{
    try {
        var returnValue = value.trim().toInt()
        return returnValue

    } catch (e: NumberFormatException){
        println("Invalid Number")
        return 10
    }
}

fun sortEquations(): ArrayList<Operators>{

    var equationList: ArrayList<Operators> = ArrayList<Operators>()

    for(equation in 0..19){
        var randOp = (0..1).random()
        var operators: Operators = Operators(0,0,0, 0)
        var operation: ArrayList<Int>

        if(randOp % 2 == 0){
            operation = operators.adition()
        } else {
            operation = operators.subtraction()
        }

        operators.number1 = operation[0]
        operators.number2 = operation[1]
        operators.result = operation[2]
        equationList.add(operators)
    }
    return equationList
}