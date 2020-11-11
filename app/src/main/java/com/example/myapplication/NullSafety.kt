package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    lateinit var lateCar:Car
class Car(val number :Int){

}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null)

        val number :Int = 20
        val number1 : Int? = null


        val number3 = number1?.plus(number)
//        Log.d("number","number3"+number3)
        // 삼항 연산자 -> 엘비스 연산자 (?:)
        // Null safety 를 휘한 도구
        val number4 = number1 ?:10
//        Log.d("number","number4 : " + number3)
        lateCar=Car(10)
        Log.d("number","latenumber : " + lateCar.number)
    }

    fun plus(a:Int,b:Int?):Int{
        if(b != null) return a+b
        else return a
    }
    fun plus2(a:Int,b:Int?):Int?{
        return b?.plus(a)
    }
}