package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

// This class allows a user to roll a dice and display the result to the screen
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Stores a reference to this specific button through the variable rollButton (Not Button itself)
        // (R.id.button) is the resource id for this specific button (unique identifier)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    // Rolls the dice and updates the screen with the result
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.diceTextView)
        resultTextView.text = diceRoll.toString()
    }
}

// This class creates a dice that has a specific number of sides
class Dice(private val numberOfSides: Int) {

    // Returns a random number based on the number of sides the dice has
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}