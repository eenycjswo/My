package MyTest

fun main(array:Array<String>){
    val number:Int= 3
while(true) {

    val result = when (number) {
        1 -> 2
        2 -> 1
        else -> 2
    }
    println(result)
    if(number==1){
        break
    }
}

}