package com.example.project2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Question2Activity : AppCompatActivity() {

    companion object {
        const val actualScore = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
    }

    fun buttonProcessing(view: View){
        val actualScore = intent.getIntExtra(actualScore, 0) + if(view.id == R.id.checkBoxQ21) 1 else 0
        val nextIntent = Intent(this, Question3Activity::class.java)

        nextIntent.putExtra(Question3Activity.actualScore, actualScore)
        startActivity(nextIntent)
    }
}
