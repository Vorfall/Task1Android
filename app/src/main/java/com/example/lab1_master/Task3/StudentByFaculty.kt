package com.example.lab1_master.Task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lab1_master.R

class StudentByFaculty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_by_faculty)
        val text: TextView = findViewById(R.id.textStudentByFaculty)
        text.text=this.intent.getSerializableExtra("students").toString()
    }
}