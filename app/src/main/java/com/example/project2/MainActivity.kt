package com.example.project2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonProcessing(view: View){
        if(view.id == R.id.buttonBegin){
            startActivity(Intent(this, Question1Activity::class.java))
        }
        else{
            finish()
            moveTaskToBack(true)
        }
    }
}
