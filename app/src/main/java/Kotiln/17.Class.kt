package Kotiln

fun main(array:Array<String>){
    //클래스 (설명서)를 통해서 실체를 만드는 방법
    //->인스턴스화 ->인스턴스(객체)
    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다.
    val bigCar1 : Car =Car("v8 engine", "big")
    val superCar : SuperCar=SuperCar("good engine","big","white")
    val number : Int = 10
// 인스턴스가 가지고있는 기능을 사용하는 방법
    val runableCar:RunableCar = RunableCar("simple eingine","body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

val runableCar2: RunableCar2= RunableCar2("nice engine","long body")
    println(runableCar2.body)
    println(runableCar2.engine)
val testCalss  = TestClss()
    testCalss.test(1)
    testCalss.test(1,2)
}




// 클래스 (설명서) 만드는 방법(1)
class Car(var engine:String, var body:String){
}

// ★*이게 더 중요함* ★클래스 (설명서) 만드는 방법(2)
class SuperCar{
    var engine : String=""
    var body : String=""
    var door : String=""

    constructor(engine:String,body: String,door:String){
        println(engine)
        println(body)
        println(door)
        this.engine=engine
        this.body =body
        this.door=door
    }
}
//     클래스 (설명서) 만드는 방법(3)
// 클래스(설명서) 만드는 방법(3) - > 1번 방법의 확장
class Car1(engine: String,body: String){
    var door: String=""

//    생성자
    constructor(engine: String,body:String,door:String):this(engine,body){
        this.door=door
    }
}
// ★*이게 더 중요함* 클래스(설명서) 만드는 방법( 4) ->2번 방법의 확장
class Car2{
    var engine : String=""
    var body: String=""
    var door:String=""

    constructor(engine: String,body: String){
        this.engine=engine
        this.body=body
    }
    constructor(engine: String,body: String,door: String){
        this.engine=engine
        this.body=body
        this.door=door
    }
}
class RunableCar(engine: String,body: String){

    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다 !")
    }
    fun navi(destination : String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}
class RunableCar2{
    var engine:String
    var body : String
    constructor(engine: String,body: String) {
        this.engine = engine
        this.body = body
    }

    init{
//        초기셋팅을 할 때 유용하다
        println("RunableCar2가 만들어 졌습니다.")
    }
        fun ride(){
            println("탑승 하였습니다.")
        }
        fun drive(){
            println("달립니다 !")
        }
        fun navi(destination : String){
            println("$destination 으로 목적지가 설정되었습니다.")
        }


}
//오버 로딩
class TestClss(){
    val a :Int=10

    fun test(a:Int){
        println("up")
    }
    fun test(a:Int,b:Int){
        println("dwon")
    }

}
