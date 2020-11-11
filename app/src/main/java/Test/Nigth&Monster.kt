package Test

import MyTest.math

fun main(array: Array<String>) {

val nigth:Nigth= Nigth(20,0)
    val monster:Monster=Monster(30,2)

nigth.attack(monster)
}

class Nigth(var Hp:Int,var Power:Int){
    fun attack(monster: Monster){
        monster.defense(Power)
    }
    fun defense(){

    }
}

class Monster(var Hp:Int,var Power:Int){
    fun attack(){

    }
    fun defense(number1 : Int){
    Hp-=number1

        if(Hp<0){
            println("${javaClass.simpleName}사망")
        }else{
            println("${javaClass.simpleName} 남은 체력$Hp")
        }
    }
}


