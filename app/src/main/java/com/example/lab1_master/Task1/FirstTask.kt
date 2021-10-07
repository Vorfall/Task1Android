package com.example.lab1_master.Task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.lab1_master.R
import com.example.lab1_master.Student


class firstTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)
        title = "1"


        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(this::getData)
    }

    private fun getData(view: View) {

        var students : Array<Student> =Array<Student>(25) { Student(RandomName(), resources.getStringArray(R.array.groups).random()) }
        val listGroup = findViewById<TextView>(R.id.text)
        val switchGropup = findViewById<Spinner>(R.id.list)

        val selectedDestination = switchGropup.selectedItem.toString()

        val studentByGroup =students.filter { student -> student.group == selectedDestination }
        listGroup.text = studentByGroup.map { student -> student.name }.toString()

    }

    public fun RandomName():  String {
        return ('A'..'Z').random()+(1..(5..7).random())
            .map { ('a'..'z').random() }
            .joinToString("")
    }


}