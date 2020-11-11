package MyTest

fun main(array:Array<String>){
    val ddubbuyi:Food=Food("dduk","gochu",10)

}
class Food{
    val main :String
    val sosu : String
    val woter:Int
    constructor(main:String,sosu:String,woter:Int){

        this.main=main
        this.sosu=sosu
        this.woter=woter
        println(main)
        println(sosu)
        println(woter)

    }
}