package org.eu5.learn_pisio.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import android.widget.Toast
import kotlinx.android.synthetic.*
import java.util.*

class MainActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val rollButton: Button = findViewById(R.id.roll_button)
		rollButton.text = getString(R.string.roll_button)
		
		// This setter takes a single Lambda function --> setOnClickListener { }
		// which is triggered every time that button is clicked --> roll_button.
		rollButton.setOnClickListener {
			// test that the button click works!
			//Toast.makeText(this, "button clicked!", Toast.LENGTH_SHORT).show()
			
			// method to be called when the button is clicked
			rollDice()
		}
	}
	
	// implement rollDice() method
	private fun rollDice() {
		// TODO("Not yet implemented")
		// generate random number from semi-interval/semi-segment [0, 6)
		// invoking constructor Random() of standard Java class (java.util.Random)
		val randomInt = Random().nextInt(6) + 1 // <-- java.util.Random public Random()
		
		// get a reference to the TextView result_text
		val resultText: TextView = findViewById(R.id.result_text)
		
		// test button click to TextView result_text
		//resultText.text = "Dice Rolled!"
		
		// set generated number as text of TextView result_text:
		// a) using setter method <-- from Java!
		//resultText.setText(randomInt.toString())
		// or
		// b) property access syntax <-- Kotlin!
		resultText.text = randomInt.toString()
	}
}
