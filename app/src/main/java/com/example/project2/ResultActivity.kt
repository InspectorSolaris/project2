package com.example.project2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*
import java.lang.Math.ceil

class ResultActivity : AppCompatActivity() {

    companion object {
        const val resultScore = "0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        calculateResult()
    }

    private fun calculateResult(){
        val result = intent.getIntExtra(resultScore, 0)
        val result10 = ceil(10 * result.toDouble() / 3).toInt()

        textViewResult.text = result10.toString() + "/10"
    }

    fun buttonProcessing(view: View){
        if(view.id == R.id.buttonTryAgain){
            startActivity(Intent(this, Question1Activity::class.java))
        }
        else{
            finish()
            moveTaskToBack(true)
        }
    }
}
