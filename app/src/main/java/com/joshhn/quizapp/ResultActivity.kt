package com.joshhn.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tvName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnReplay: Button = findViewById(R.id.btnReplay)

        val mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0).toString()
        val mTotalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0).toString()

        tvName?.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore?.text = "Your score is $mCorrectAnswers out of $mTotalQuestions"
        btnReplay?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}