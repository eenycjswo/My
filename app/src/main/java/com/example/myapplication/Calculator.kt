package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_calculator2.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        var new = "0"
        var old = "0"
        one1.setOnClickListener {
            Log.d("click","click!!")
            new = new + "1"
            result.setText(new)
        }
        two2.setOnClickListener {
            new = new + "2"
            result.setText(new)
        }
        three3.setOnClickListener {
            new = new + "3"
            result.setText(new)
        }
        four4.setOnClickListener {
            new = new + "4"
            result.setText(new)
        }
        five5.setOnClickListener {
            new = new + "5"
            result.setText(new)
        }
        six6.setOnClickListener {
            new = new + "6"
            result.setText(new)
        }
        seven7.setOnClickListener {
            new = new + "7"
            result.setText(new)
        }
        eight8.setOnClickListener {
            new = new + "8"
            result.setText(new)
        }
        nine9.setOnClickListener {
            new = new + "9"
            result.setText(new)
        }

        clear.setOnClickListener {
            old = "0"
            new = "0"
            result.setText("0")
        }
        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            result.setText(old)
        }


    }
}