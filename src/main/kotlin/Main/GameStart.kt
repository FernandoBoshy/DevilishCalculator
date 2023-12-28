package Main

import Equations.Operators

var operation: Operators = Operators(0,0,0)

class GameStart {
    fun startGame(level: Int, equationList: ArrayList<Operators>){
        for(nBack in 0..level){
            println("(${nBack + 1})|${equationList[nBack].number1} + ${equationList[nBack].number2} = ?")
            printLoad()
        }
        for((x, equation) in equationList.withIndex()){
            if(x > level){
                var resposta = readln()
                println("(${x + 1})|${equation.number1} + ${equation.number2} = ?")
            }
        }


//        for (x in 0..20){
//            for(level in 0..level){
//
//            }
//            var result: Int = (0..9).random()
//            printSpaces()
//            operation.subtraction()
//        }
    }
}

fun printSpaces(){
    println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n" +
            " \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n")
}

fun printLoad(){
    println("_ _ _ _ _|")
    for(x in 0..3){
        print("- ")
        Thread.sleep(1000)
    }
    println("-")

}