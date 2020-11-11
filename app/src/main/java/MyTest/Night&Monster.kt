package MyTest


fun main(Array:Array<String>){
   val nigth100:Nigth100= Nigth100(10,2)
    val monSter100:MonSter100= MonSter100(8,3)
   nigth100.attack(monSter100)


}

open class Nigth100( var hp :Int, val power:Int){
   open fun attack(monSter100: MonSter100){
        monSter100.defense(power)
    }
   open fun defense(damage: Int){
        hp-=damage

        if(hp>=0){
            heal()

            println("기사 체력이 $hp 남았습니다.")
        }else{
            println("기사가 죽었습니다.")
        }
    }
   private fun heal(){
        hp+=power
       println("기사가 $hp 힐했습니다.")
    }
}


open class MonSter100(private var hp: Int,val power: Int){
   open fun attack(nigth100: Nigth100){
nigth100.defense(power)
    }
    open fun defense(damage:Int){
        hp -= damage
        if(hp>=0){
            println("몬스터 체력이 $hp 남았습니다.")
        }else{
            println("몬스터 죽었습니다.")
        }
    }
}

