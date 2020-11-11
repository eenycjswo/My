package Kotiln

fun main(array:Array<String>){
val plusminus:Calculator1= Calculator1()
//    더하기
    println(plusminus.minus(10,10))
//    빼기
    println(plusminus.plus(10,10))
//    곱하기
    println(plusminus.mutiply(50,50))
//    나누기 (println() 안쓴유형)
    plusminus.divide(10,2)
    val Calculator2:Calculator2= Calculator2()
    println(Calculator2.divide(10,2,3))
    println(Calculator2.minus(10,2))

}
// 가장 쉬운 사칙연산
class Calculator1(){
    fun plus(a:Int,b:Int):Int{
        return  a + b
    }
    fun minus(a:Int,b: Int):Int{
//        먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }
    fun mutiply(a:Int,b:Int):Int{
        return  a*b
    }
    fun divide(a:Int,b: Int){
      println(a /b)
    }

}
class Calculator2(){
    fun plus(vararg numbers:Int):Int{//1,2,3
        var result :Int= 0
        numbers.forEach {
//        result = result + it
             result += it
         }
        return result
    }
    fun minus(vararg numbers: Int):Int{
        var result:Int=0
        for(i in 0 until numbers.size){
            if(i !=0){
            result -= numbers[i]
        }
        }
        return result
    }

    fun multiply(vararg numbers:Int):Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }

        }
        return result

}
    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->

            if (index != 0 && value!=0) {
                result = result / value
            }
        }
        return result
    }
}


