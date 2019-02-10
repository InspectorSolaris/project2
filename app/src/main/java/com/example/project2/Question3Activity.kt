package com.example.project2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Question3Activity : AppCompatActivity() {

    companion object {
        const val actualScore = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)
    }

    fun buttonProcessing(view: View){
        val actualScore = intent.getIntExtra(actualScore, 0) + if(view.id == R.id.checkBoxQ32) 1 else 0
        val nextIntent = Intent(this, ResultActivity::class.java)

        nextIntent.putExtra(ResultActivity.resultScore, actualScore)
        startActivity(nextIntent)
    }
}
