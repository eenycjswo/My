package MyTest

fun main(array:Array<String>){
//    val channels = listOf<String>("k","m","s")
val tv :TV= TV(listOf<String>("k","m","s"))
tv.Up()
    tv.Up()
    tv.Up()
    tv.Up()
    tv.Up()
    println(tv.check())







}
class TV(val channels:List<String>){
    var onOrOff:Boolean=false
    var number = 0
    set(value) {
        field = value
      if(field > 2 ){
          field ==0
      }
        if(field <0){
            field = 2
        }
    }
    get(){
        println("호출되었습니다")
        return field
    }
    fun switch(){
        onOrOff = !onOrOff
    }
    fun check():String{
         return channels[number]
    }
    fun Up(){
       number += 1
    }
    fun dowon(){
        number -= 1
        }

}