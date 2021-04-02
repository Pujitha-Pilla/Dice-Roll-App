package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceValue : TextView
    lateinit var dice : ImageView
    lateinit var roll : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceValue = findViewById(R.id.tv_diceValue)
        dice = findViewById(R.id.img_dice)
        roll = findViewById(R.id.btn_roll)

        roll.setOnClickListener {
            val diceObject = Dice(6)
            val rolledValue : Int = diceObject.roll()
            diceValue.text = rolledValue.toString()
            when(rolledValue){

                1 -> dice.setImageResource(R.drawable.dice_1)
                2 -> dice.setImageResource(R.drawable.dice_2)
                3 -> dice.setImageResource(R.drawable.dice_3)
                4 -> dice.setImageResource(R.drawable.dice_4)
                5 -> dice.setImageResource(R.drawable.dice_5)
                6 -> dice.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
