package Kotiln

fun main(Colletion:Array<String>){

//    immutable Colletion(변경 불가능
//    List - > 중복을 허용한다
    val numberList= listOf<Int>(1,2,3,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])



//    set -> 즁복을 허용하지 않는다
//    -> 순서가 없다!!
    val numberSet = setOf<Int>(1,2,3,3,3)
    println()
    println(numberSet)
//    순서대로 출력
    numberSet.forEach{
        println(it)
    }

//      Map ->Key,value 방식으로 관리한다
    val numberMap= mapOf<String,Int>("one" to 2,"two" to 2)
    println()
    println(numberMap)
    println(numberMap.get("one"))


//   Mutable Colletion(변경가능
    val mNumber= mutableListOf<Int>(1,2,3)
    mNumber.add(3,4)
    println()
    println(mNumber)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)
    mNumberMap.forEach{
        println(it)
    }


}