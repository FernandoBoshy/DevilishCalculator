package Main

import Equations.Operators

var operation: Operators = Operators(0,0,0)

class GameStart {

    fun startGame(level: Int){
        for (x in 0..20){
            for(level in 0..level){

            }
            var result: Int = (0..9).random()
//            printSpaces()
            operation.subtraction()
        }
    }
}

fun printSpaces(){
    println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" +
            " \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n")
}