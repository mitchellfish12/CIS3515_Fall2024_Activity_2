package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* TODO Step 2: Populate this array with multiples of 5 from 5 - 100*/
        val numberArray = Array(20) {5 * (it + 1)}

        /* TODO Step 3: Create adapter to display items from array in Spinner */

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, numberArray)
        spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter


        // TODO Step 4: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}