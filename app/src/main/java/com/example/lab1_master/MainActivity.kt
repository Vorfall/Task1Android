package com.example.lab1_master

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab1_master.Task1.firstTask
import com.example.lab1_master.Task2.secondTask
import com.example.lab1_master.Task3.thirdTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Master Menu")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent= Intent(this, MainActivity::class.java)
        var but1: Button = findViewById(R.id.button1)
        var but2: Button = findViewById(R.id.button2)
        var but3: Button = findViewById(R.id.button3)

        but1.setOnClickListener{
            intent = Intent(this, firstTask::class.java)
            intent.putExtra("students", "123")
            startActivity(intent)
        }
        but2.setOnClickListener{
            intent = Intent(this, secondTask::class.java)
            startActivity(intent)
        }
        but3.setOnClickListener{
            intent = Intent(this, thirdTask::class.java)
            startActivity(intent)
        }
    }
}