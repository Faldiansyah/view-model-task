package com.cowok.hijrah.chapter4topic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonViewModel.setOnClickListener {
            val pindahActivity = Intent(this, UsingViewModelActivity::class.java)
            startActivity(pindahActivity)
        }

        buttonBerita.setOnClickListener {
            val toBerita = Intent(this, BeritaActivity::class.java)
            startActivity(toBerita)
        }

        buttonStudent.setOnClickListener {
            val toStudent = Intent(this, StudentActivity::class.java)
            startActivity(toStudent)
        }

    }
}