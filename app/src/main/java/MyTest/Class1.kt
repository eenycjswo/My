package MyTest

fun main(array:Array<String>){

//val math:Calculator1= Calculator1(30)
//    println(math.plus(30))
val math1:math=math(30)
    println(math1.plus(30))
}
class Calculator1(val int:Int){

    fun plus(number1:Int): Calculator1 {
        val result = this.int + number1
        return Calculator1(result)
 }

    val math:over=over()

}

class math (var init1:Int){
    fun plus(number:Int):Int{
        val result = init1 - number

        return result
    }
}

class over(){
    fun test(a:Int){
println(a)
    }
    fun test(a:Int,b:Int):Int{
        return a+b
    }
}
