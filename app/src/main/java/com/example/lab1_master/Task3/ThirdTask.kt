package com.example.lab1_master.Task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.example.lab1_master.R

import java.util.*


class thirdTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_task)
        title = "3"
        var i: Number = 0;

        val students: Array<Student2> = Array<Student2>(25) {
            Student2((0..250).random(),
                resources.getStringArray(R.array.groups).random(),
                ('A'..'Z').random() + (1..(5..7).random())
                    .map { ('a'..'z').random() }
                    .joinToString(""),
                ('A'..'Z').random() + (1..(5..7).random())
                    .map { ('a'..'z').random() }
                    .joinToString(""),
                ('A'..'Z').random() + (1..(5..7).random())
                    .map { ('a'..'z').random() }
                    .joinToString(""),
                ('A'..'Z').random () + (1..(5..7).random())
                    .map { ('a'..'z').random() }
                    .joinToString(""),
                resources.getStringArray(R.array.faculty).random(),
                resources.getStringArray(R.array.course).random(),
                Date(/*1998*/(1997..2001).random(), (1..12).random(), (1..31).random()))
        }

        val studentByFaculty = students.filter { students -> (students.faculty == "Fais") }
        val nameStudentByFaculty: List<String> = studentByFaculty.map { it.surName } // ["A", "D"]

        val studentByFacultyGroup = students.filter { students -> (students.faculty == "Fais") && (students.course == "2") }
        val nameStudentByFacultyGroup: List<String> = studentByFacultyGroup.map { it.surName } // ["A", "D"]

        val studentByYear = students.filter { students -> (students.DOB.year > 1997) }
        val nameStudentByYear: List<String> = studentByYear.map { it.surName } // ["A", "D"]

        val studentByGroup = students.filter { students -> (students.group == "gr-2") }
        val nameStudentByGroupp: List<String> = studentByGroup.map { it.surName } // ["A", "D"]


        var studentByFacultyBut:Button = findViewById(R.id.Course)
        var studentByFacultyGroupBut:Button = findViewById(R.id.CourseFAcult)
        var studentByYearBut:Button = findViewById(R.id.Year)
        var studentByGroupBut:Button = findViewById(R.id.Group)

        studentByFacultyBut.setOnClickListener {

            var intent = Intent(this, StudentByFaculty::class.java)
            intent.putExtra("students", nameStudentByFaculty.toString())
            startActivity(intent)
        }

        studentByFacultyGroupBut.setOnClickListener {

            var intent = Intent(this, StudentByFacultyGroup::class.java)
            intent.putExtra("students", nameStudentByFacultyGroup.toString())
            startActivity(intent)
        }
        studentByYearBut.setOnClickListener {

            var intent = Intent(this, StudentByYear::class.java)
            intent.putExtra("students", nameStudentByYear.toString())
            startActivity(intent)
        }
        studentByGroupBut.setOnClickListener {

            var intent = Intent(this, StudentByGroup::class.java)
            intent.putExtra("students", nameStudentByGroupp.toString())
            startActivity(intent)
        }
    }
}

/*
Student2(('A'..'Z').random() + (1..(5..7).random())
            .map { ('a'..'z').random() }
            .joinToString(""),
            resources.getStringArray(R.array.groups).random())


*/