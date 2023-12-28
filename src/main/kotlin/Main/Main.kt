package Main

import Equations.Operators
import java.lang.NumberFormatException

    /*
    criar um jogo de calculadora baseado no devilish calculator

    antes do jogo: escolher o nível (1 a 5)
    durante o jogo: o jogo consiste em gravar as respostas de vários cálculos
    enquanto o jogo mostra algumas operações, você precisa gravar as operações
    anteriores (o mesmo tanto da quantidade de níveis) e colocar as respostas
    na mesma ordem

    após escolher o nível, fazer uma lista com 20 itens, cada item é uma instância
    de classe com 3 variáveis: X + Y = Z que vão ser os números mostrados no jogo

    */
var gamestart = GameStart()

fun main(args: Array<String>) {
    while (true){
        var equationList = sortEquations()
        var level: Int = chooseLevel()
        gamestart.startGame(level, equationList)
        break
    }
}

fun chooseLevel(): Int {
    var level: Int = 1
    println("Choose the difficult number:")
    println("> 1 < = Very Easy")
    println("> 2 < = Easy")
    println("> 3 < = Normal")
    println("> 4 < = Hard")
    println("> 5 < = Very Hard")

    level = intValidation(readln())

    return level
}

fun intValidation(value: String): Int{
    try {
        var returnValue = value.toInt()
        return returnValue

    } catch (e: NumberFormatException){
        println("Invalid Number")
        return 0
    }
}

fun sortEquations(): ArrayList<Operators>{

    var equationList: ArrayList<Operators> = ArrayList<Operators>()

    for(equation in 0..20){
        var operators: Operators = Operators(0,0,0)
        var operation = operators.adition()
        operators.number1 = operation[0]
        operators.number2 = operation[1]
        operators.result = operation[2]
        equationList.add(operators)
    }
    return equationList
}