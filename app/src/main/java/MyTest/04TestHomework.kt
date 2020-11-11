package MyTest

fun main(array:Array<String>){
    val Tv:TvOnOff=TvOnOff("티부이온","티부이오프")
}

class TvOnOff{
    val On:String
    val Off:String
    constructor(On:String,Off:String){
        println(On)
        println(Off)
        this.On=On
        this.Off=Off

    }
}