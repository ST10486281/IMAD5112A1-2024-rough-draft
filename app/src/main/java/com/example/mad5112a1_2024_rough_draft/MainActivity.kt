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
                    result = "Anne Frank – Diarist during the Holocaust (died at 15)";
                } else if(15 < validatedValue && validatedValue <= 20) {
                    result = "Joan of Arc – French heroine and martyr (died at 19)";
                } else if(20 < validatedValue && validatedValue <= 25) {
                    result = "Tupac Shakur – Rapper and activist (died at 25)";
                } else if(25 < validatedValue && validatedValue <= 30) {
                    result = "Heath Ledger – Actor (died at 28)";
                } else if(30 < validatedValue && validatedValue <= 35) {
                    result = "Bruce Lee – Martial artist and actor (died at 32)";
                } else if(35 < validatedValue && validatedValue <= 40) {
                    result = "Amelia Earhart – Aviator and explorer (disappeared at 39)";
                } else if(40 < validatedValue && validatedValue <= 45) {
                    result = "Chadwick Boseman – Actor (died at 43)";
                } else if(45 < validatedValue && validatedValue <= 50) {
                    result = "George Orwell – Author (died at 46)";
                } else if(50 < validatedValue && validatedValue <= 55) {
                    result = "George Michael – Pop legend and former Wham! member (died at 53)";
                } else if(55 < validatedValue && validatedValue <= 60) {
                    result = "Steve Jobs – Co-founder of Apple (died at 56)";
                } else if(60 < validatedValue && validatedValue <= 65) {
                    result = "Anthony Bourdain – Renowned chef, author, and travel documentarian (died at 61)";
                } else if(65 < validatedValue && validatedValue <= 70) {
                    result = "Leonardo da Vinci – Inventor and artist (died at 67)\u200B";
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