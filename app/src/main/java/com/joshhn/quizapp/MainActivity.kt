package com.joshhn.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.btnStart)
        var etName: EditText = findViewById(R.id.etName)

        btn.setOnClickListener {
            if(etName.text.isEmpty()){
                Toast.makeText(this,"Please enter your name!", Toast.LENGTH_LONG).show()
            }else{
                var intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish() //Finish the main activity -> Users cannot comeback
            }
        }
    }
}