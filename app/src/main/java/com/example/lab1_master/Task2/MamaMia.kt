package com.example.lab1_master.Task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lab1_master.R

class MamaMia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mia)
        val text: TextView = findViewById(R.id.textDestroi)
        text.text=this.intent.getSerializableExtra("students").toString()
    }
}