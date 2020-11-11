package Kotiln
// 변수의 접근 범위
//1. 전역 변수
//2. 지역 변수
var number100 : Int = 10

fun main(array:Array<String>){
    val list = listOf<Int>(1,2,3)

println(number100)

    val test = Test("홍길동")
    println(number100)
    test.testFun()
test.name
    println(number100)
    test.testFun()
    test.name


for(list1 in list){
    if(list1 == 2) println("이")
    else println("오")
}


    list.forEach{
        println(it)
        if(it == 2){
            println("오")
        }else println("이")
    }


    list.forEachIndexed{index,value->
        println(""+index+" "+value)
    }
    for( i in 0 until  list.size){
        println(list.get(i))
    }


}


class Test(var name :String){

    fun testFun(){
        var birth :  String = "2000/3/1"
        name = "홍길동"
        number100 = 100

    }
    fun tsetFun2(){

    }

}