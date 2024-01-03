package Main

import Equations.Operators

var operation: Operators = Operators(0,0,0, 0)

class GameStart {
    var correctAnswer: Int = 0
    var wrongAnswer: Int = 0

    fun startGame(level: Int, equationList: ArrayList<Operators>) {
                            //////////////////
        correctAnswer = 0  //  Score reset //
        wrongAnswer = 0   //////////////////

        for (nBack in 0..level) {

            printLoad()
            printSpaces()

            if (equationList[nBack].id == 0){
                println("(Q:${nBack+1}): ${equationList[nBack].number1} + ${equationList[nBack].number2} = ?")
            } else {
                println("(Q:${nBack+1}): ${equationList[nBack].number1} - ${equationList[nBack].number2} = ?")
            }

        }
        for ((x, equation) in equationList.withIndex()) {
            if (x <= 18 - level) {
                print("(A:${x + 1}): ")
                var answer = intValidation(readln())
                printSpaces()

                if (equationList[x + level + 1].id == 0){
                    println("(Q:${x + level + 2}): ${equationList[x + level + 1].number1} + ${equationList[x + level + 1].number2} = ?")
                } else {
                    println("(Q:${x + level + 2}): ${equationList[x + level + 1].number1} - ${equationList[x + level + 1].number2} = ?")
                }

                if (answer == equationList[x].result) {
                    correctAnswer += 1
                } else {
                    wrongAnswer += 1
                }
            } else {
                print("(A:${x+1}): ")
                var answer = intValidation(readln())
                printSpaces()

                if (answer == equationList[x].result) {
                    correctAnswer += 1
                } else {
                    wrongAnswer += 1
                }
            }
        }
        println("Correct: $correctAnswer & Incorrect: $wrongAnswer")
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