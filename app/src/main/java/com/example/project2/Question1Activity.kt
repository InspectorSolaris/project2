package com.example.project2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Question1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)
    }

    fun buttonProcessing(view: View){
        val actualScore = if(view.id == R.id.checkBoxQ11) 1 else 0
        val nextIntent = Intent(this, Question2Activity::class.java)

        nextIntent.putExtra(Question2Activity.actualScore, actualScore)
        startActivity(nextIntent)
    }
}
