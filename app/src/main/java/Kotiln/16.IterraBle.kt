package Kotiln

fun main(array:Array<String>){
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

   for(item in a){
       println(item)
       if(item == 5){
           println("item is Five")
       }else{
           println("item is not Five")
       }

   }
    println()
    for((index,item) in a.withIndex()){
        println("index :"+(index+1)+" value :"+item)
    }
    println()
    a.forEach{
    println(it)
    }
    println()
    //반복하는 방법(4
    a.forEach(){item->
        println(item)
    }
//    반복하는 방법 (5
    println()
    a.forEachIndexed { index, item ->
        println("index :" + (index + 1) + " value :" + item)
    }
//    반복하는 방법 (6
//     until 은 마지막 숫자를 포함하지 않음
    println(a.size)
    for(i in 0 until a.size){
        println(a.get(i))

    }
    // 방법(7
    println()
    for(i in 0 until a.size step(2)){
        println(a.get(i))

}
    println()
//    방법 (8
    for(i in a.size - 1 downTo  (0)){
        println(a.get(i))

    }
    println()
//    반복하는 방법(9
    for (i in a.size -1 downTo (0) step(2)){
        println(a.get(i))
    }
//    방복하는 방법(10
    println()
    for(i in 0..10){
//        ..은 마지막을 포함
        println(i)
    }
    println("--------------")
//    반복하는 방법(11
    var b:Int= 0
    var c:Int=10
    while(true){
   if(b<c){
       while(b<c){
           b++//while문을 정지 시키기 위한 코드
           println(b)
    }
   }else break;
    }
    var d: Int = 0
    var e : Int = 4
//    반복하는 방법 12
    do{
        println("hello")
        d++
    }while(d<e)


    }