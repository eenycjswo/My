package MyTest

fun main(Array:Array<String>){
    var kimeen:Bank= Bank("kimeen","0417","10,000")

   var BankSkil:Bank2=Bank2("출금","입금")
BankSkil.cnfrma("만원")
    BankSkil.dlqrma("이만원")

}
class Bank{
    val name:String
    val birthday:String
    val mymoney:String

    constructor(name:String,birthday:String,mymoney:String){
        println(name)
        println(birthday)
        println(mymoney)
        this.name=name
        this.birthday=birthday
        this.mymoney=mymoney
    }

}

class Bank2(a:String,b:String) {
    fun dlqrma(money1 : String){
        println("$money1 출금")
    }
    fun cnfrma(money2 : String) {
        println("$money2 입금")
    }
}
