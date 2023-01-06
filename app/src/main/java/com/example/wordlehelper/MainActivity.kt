package com.example.wordlehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnGo = findViewById<Button>(R.id.goBtn)

        val btnReset = findViewById<Button>(R.id.resetLetters)
        val btnSome = findViewById<Button>(R.id.someLetters)
        val btnClear = findViewById<Button>(R.id.clearLetters)

        val txtWord = findViewById<TextInputEditText>(R.id.wordBox)
        val txtUnused = findViewById<TextInputEditText>(R.id.unusedLetters)
        val txtWild = findViewById<TextInputEditText>(R.id.wildCards)
        val txtWrong = findViewById<TextInputEditText>(R.id.wrongPos)

        btnReset.setOnClickListener {
            txtUnused.setText("qwer tyui op asdf ghjkl zxc vbnm")
        }
        btnSome.setOnClickListener {
            txtUnused.setText("qgjzxvb chuf")
        }
        btnClear.setOnClickListener {
            txtUnused.setText("")
        }

        val wordle =Wordle()


        btnGo.setOnClickListener {

            val output = wordle.fileLoc();
            Toast.makeText(this@MainActivity, output
                , Toast.LENGTH_SHORT).show()
        }

    }



}