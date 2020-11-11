package Test


fun main(array:Array<String>){
    val MyBank:Bank= Bank("김인","010417",5000)

println(MyBank.checkMoney())
    MyBank.plus(600)
    println(MyBank.minus(6000))
}

class Bank(private val name:String,private val birth:String,private var money:Int){

    fun checkMoney():Int{
     val result = money
        return result
    }
    fun plus(number:Int){
    println(money+number)
    }

    fun minus(number: Int){
    if(money-number<0){
        println("잔액이 부족합니다.")
    }
        if(money-number>0){
            println(money-number)
        }
    }

}