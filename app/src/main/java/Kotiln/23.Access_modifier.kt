package Kotiln

fun main(Array:Array<String>){
    val testAccess:TestAccess= TestAccess("아무개")
//    pirvate 키워드 때문에 외부에서 더이상 사용할수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name="아무개 투"
//    println(testAccess.name)
    val reward=Reward()
    reward.rewardAmount=2000
    val RuningCar:RunningCar= RunningCar()
    RuningCar.FunFast()
println(reward)
}
class Reward(){

    var rewardAmount:Int=1000

}
class TestAccess{
    private var name :String = "홍길동"
    constructor(name:String){
    this.name=name
    }
    fun Name(newName:String){
        this.name=newName
    }
   private fun test(){
        println("테스트")
    }
}

class RunningCar{

    fun FunFast(){
        run()
    }
   private fun run(){

    }
}