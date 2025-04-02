package com.example.mad5112a1_2024_rough_draft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)


        val textView = findViewById<TextView>(R.id.textView)
        val editTextText = findViewById<EditText>(R.id.editTextText)


        button?.setOnClickListener {


            val validatedValue = editTextText.text.toString().toIntOrNull()


            var result = ""
            if(validatedValue !== null){
                if(validatedValue < 10) {
                    result = "Please a number greater than 10";
                } else if(10 < validatedValue && validatedValue <= 15) {
                    result = getString(R.string.less_than_15);
                } else if(15 < validatedValue && validatedValue <= 20) {
                    result = getString(R.string.less_than_20);
                } else if(20 < validatedValue && validatedValue <= 25) {
                    result = getString(R.string.less_than_25);
                } else if(25 < validatedValue && validatedValue <= 30) {
                    result = getString(R.string.less_than_30);
                } else if(30 < validatedValue && validatedValue <= 35) {
                    result = getString(R.string.less_than_35);
                } else if(35 < validatedValue && validatedValue <= 40) {
                    result = getString(R.string.less_than_40);
                } else if(40 < validatedValue && validatedValue <= 45) {
                    result = getString(R.string.less_than_45);
                } else if(45 < validatedValue && validatedValue <= 50) {
                    result = getString(R.string.less_than_50);
                } else if(50 < validatedValue && validatedValue <= 55) {
                    result = getString(R.string.less_than_55);
                } else if(55 < validatedValue && validatedValue <= 60) {
                    result = getString(R.string.less_than_60);
                } else if(60 < validatedValue && validatedValue <= 65) {
                    result = getString(R.string.less_than_65);
                } else if(65 < validatedValue && validatedValue <= 70) {
                    result = getString(R.string.less_than_70);
                } else if(70 < validatedValue) {
                    result = "Please a number less than 71";
                }
            } else {
                result = "Please enter a valid number";
            }


            textView.text = result


        }
    }
}