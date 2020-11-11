package Test

fun main(){
    val Bank = Person1("홍길동",1000)
    println(Bank.resultPlus(1000))
    Bank.Person2(1000)
}

open class Person(private var name:String,private var Mymoney:Int){

    private fun plus(person: Person){
        resultPlus(Mymoney)
    }
    private fun minus(person: Person){
        Person2(Mymoney)
    }

    fun resultPlus(money:Int){
        println("$money 입금")
       Mymoney+=money
        println("$Mymoney")
    }
    fun Person2(money2:Int){
        Mymoney-=money2
    }
}
class Person1(name: String="바부",Mymoney: Int):Person(name,Mymoney){

}
class Person2(name: String,Mymoney: Int):Person(name,Mymoney){

}
class Person3(name: String,Mymoney: Int):Person(name,Mymoney){

}
class Person4(name: String,Mymoney: Int):Person(name,Mymoney){

}
