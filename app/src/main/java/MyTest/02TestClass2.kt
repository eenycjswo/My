package MyTest

fun main(array:Array<String>){
    var car = Car2(engine="v8",body = "big",door = "blak")
}
class Car2{
    var engine : String=""
    var body: String=""
    var door:String=""

    constructor(engine: String,body: String){
        this.engine=engine
        this.body=body
    }
    constructor(engine: String,body: String,door: String){
        println(engine)
        println(body)
        println(door)
        this.engine=engine
        this.body=body
        this.door=door
    }
}