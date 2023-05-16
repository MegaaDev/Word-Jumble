package com.example.word_jumble

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.word_jumble.R


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button8)

        button.setOnClickListener {
            var word = findViewById<EditText>(R.id.wordfill).text.toString()
            var clue = findViewById<EditText>(R.id.clue).text.toString()
            var highScore = intent.getStringExtra("EXTRA_HIGHSCORE")?.toInt()
            var highestscore = findViewById<TextView>(R.id.highscore)
            highestscore.text = "HighScore: $highScore"

            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_WORD",word)
                it.putExtra("EXTRA_CLUE",clue)

                startActivity(it)
            }


        }
            }}
