package org.eu5.learn_pisio.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		val rollButton: Button = findViewById(R.id.roll_button)
		rollButton.text = getString(R.string.roll_button)
		
		// This setter takes a single Lambda function --> setOnClickListener { }
		// which is triggered every time that button is clicked --> roll_button.
		rollButton.setOnClickListener {
			Toast.makeText(this, "button clicked!", Toast.LENGTH_SHORT).show()
		}
	}
}
