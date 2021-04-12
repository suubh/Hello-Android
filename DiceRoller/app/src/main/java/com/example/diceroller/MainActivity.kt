package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)  //NOW OUR BUTTON CAN BE USED AS rollButton

        // THIS ONCLICK LISTENER WILL SHOW USER A POP UP MESSAGE WHEN THE BUTTON IS CLICKED.
        rollButton.setOnClickListener {
           // val toast= Toast.makeText(this,"Dice Rolled !",Toast.LENGTH_SHORT)
           // toast.show()
           //   val result:TextView = findViewById(R.id.textView)
           //   result.text="6"     //"TEXT" WILL SHOW UP THE STRING OR NUM THAT IS GIVEN
            rollDice()
        }
    }
    private fun rollDice() {
        val dice=Dice(6)
        val diceRoll=dice.roll()

        //IT WILL UPDATE THE SCREEN WITH NUMBER WHENEVER THE BUTTON IS PRESSED
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val numsides:Int){
    fun roll():Int {
        return (1..numsides).random()
    }
}