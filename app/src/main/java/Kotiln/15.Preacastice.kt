package Kotiln
// mutableListOf   mutableSetOf   mutablMapOf
fun main(array:Array<String>){

val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(4)
a.add(0,100)
    println(a)
    a.set(0,200)
    println(a)
//    remove제거 하다
//    a.removeAt(index=1)
   a.removeAt(1)
    println(a)
    a.remove(1)
    println(a)



    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(2)
    println(b)
    // set 은 index가 없어서 remove에 At이 안붙어요
    // remove = 제거하다
    b.remove(2)
    println(b)
    b.remove(100)

    val c = mutableMapOf<String, Int>("one" to 1)
    println(c)
//    put Key추가
    c.put("two",2)
    println(c)

//    Key values 변경
    c.replace("two",3)
    println(c)
    c.replace("one",2)
    println(c)
    c.replace("one",1)
    c.replace("two",2)

    println(c.keys)
    println(c.values)
//    clear 모두 제거
    c.clear()
    println(c)
}