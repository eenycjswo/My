package MyTest

import android.app.Person


fun main(array:Array<String>){

val Bank99:Bank99= Bank99(126)


Bank99.my1()

    println(Bank99.find())



}


open class Bank99(private val number:Int){


   private fun plusnumber():String{
       val result= ""+0+number
       return result
    }
    fun my1(){
        println("내 번호"+0+number)
    }

   fun find(){
       when(plusnumber()){
           "0123"->person("홍길동",200)
           "0124"->person1("김길동",500)
           "0126"->person2("권길동",1000)
           else->println("입력이 잘못되었습니다.")
       }
       return
   }

open fun person(name:String,money1: Int){
        println(name)
       println(money1)
    }
open fun person1(name:String,money: Int){
        println(name)
        println(money)
    }
fun person2(name:String,money: Int){
       println(money)
        println(name)

    }



}








