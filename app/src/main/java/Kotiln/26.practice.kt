package Kotiln

fun main(array:Array<String>){
    val night=superNight(100,100)
    val monster=superMonster(200,10)
night.attack(monster)
    monster.attack(monster)

}
open class Charathor(private var hp:Int,var power:Int){
    open fun attack(charathor: Charathor,power: Int=this.power){
        defense(power)
    }
    open fun defense(damage:Int){
        hp-=damage
        if(hp>0){
            println("${javaClass.simpleName}의 남은 체력 $hp 입니다")
        }else{
            println("사망 했습니다.")
        }
    }
}

class superNight(hp: Int, power: Int):Charathor(hp, power){
    override fun attack(charathor: Charathor, power: Int) {
        super.attack(charathor, power+2)
    }
}
class superMonster(hp: Int,power: Int):Charathor(hp, power){
  private  val defensePower=2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower)
    }
}

