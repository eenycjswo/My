package MyTest

fun main (array:Array<String>){
val mybank:Bank1= Bank1("홍길도","생일",1000)
    println(mybank.checkmoney())
println(mybank.plus(100))
    println(mybank.minus(300))
}
class Bank1{
    val name:String
    val birth:String
    var money:Int
constructor(name:String,birth:String,money:Int){
    this.name=name
    this.birth=birth
    if (money>=0){
        this.money=money
    }else{
        this.money=0
    }

    }
    fun checkmoney():Int{
        println("잔액 확인")
     return money
}
fun plus(number1:Int):Int{
    println("$number1 입급 금액")
    var result = number1 + money
    return result
}
    fun minus(number2:Int):Int{
        val result =  money - number2
        return result
        println(money)
    }


}