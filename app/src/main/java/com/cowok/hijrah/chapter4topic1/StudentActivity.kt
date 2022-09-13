package com.cowok.hijrah.chapter4topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentActivity : AppCompatActivity() {
    lateinit var rvStudent: RecyclerView
    lateinit var adapterStudent: StudentAdapter
    lateinit var studentVM: StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        dataStudent()

        studentVM = ViewModelProvider(this).get(StudentViewModel::class.java)
        studentVM.getStudent()
        studentVM.dataListStudent.observe(this, {
            adapterStudent.setDataStudentAdapter(it as ArrayList<ListStudent>)
        })
    }

    fun dataStudent(){
        rvStudent = findViewById(R.id.recyclerViewStudent)
        adapterStudent = StudentAdapter(ArrayList())

        rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = adapterStudent
    }
}