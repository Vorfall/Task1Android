package com.example.lab1_master.Task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.lab1_master.R
import com.example.lab1_master.Student
import com.example.lab1_master.Task1.firstTask

class secondTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)
        title = "2"


        val students: Array<Student> = Array<Student>(25) {
            Student(('A'..'Z').random() + (1..(5..7).random())
                .map { ('a'..'z').random() }
                .joinToString(""),
                resources.getStringArray(R.array.groups).random())
        }

        var switchGropup = findViewById<Spinner>(R.id.list)

        var selectedDestination = switchGropup.selectedItem.toString()

        var studentByGroup = students.filter { student -> student.group == selectedDestination }


        var destroi: Button = findViewById(R.id.destroi)
        var kick: Button = findViewById(R.id.kick)

        destroi.setOnClickListener {
            selectedDestination = switchGropup.selectedItem.toString()

            studentByGroup = students.filter { student -> student.group == selectedDestination }
            var intent = Intent(this, MamaMia::class.java)
            intent.putExtra("students", studentByGroup.map { student -> student.name }.toString())

            startActivity(intent)

        }

        kick.setOnClickListener {
            selectedDestination = switchGropup.selectedItem.toString()
            studentByGroup = students.filter { student -> student.group == selectedDestination }
            var intent = Intent(this, Kick::class.java)
            intent.putExtra("students", studentByGroup.map { student -> student.name }.toString())
            startActivity(intent)
        }

    }
}