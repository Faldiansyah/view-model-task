package com.cowok.hijrah.chapter4topic1.aplikasi_volbal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.cowok.hijrah.chapter4topic1.R

class BalokActivity : AppCompatActivity() {
    lateinit var etPanjang: EditText
    lateinit var etLebar: EditText
    lateinit var etTinggi: EditText
    lateinit var btnHitung: Button
    lateinit var tvResult: TextView
    lateinit var viewModel: BalokViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balok)

        etPanjang = findViewById(R.id.editTextPanjang)
        etLebar = findViewById(R.id.editTextLebar)
        etTinggi = findViewById(R.id.editTextTinggi)
        btnHitung = findViewById(R.id.buttonHitung)
        tvResult = findViewById(R.id.textViewHasil)

        viewModel = ViewModelProvider(this).get(BalokViewModel::class.java)
        tvResult.text = viewModel.hasil.toString()

        btnHitung.setOnClickListener {
            var pj = etPanjang.text.toString().toInt()
            var lb = etLebar.text.toString().toInt()
            var tg = etTinggi.text.toString().toInt()

            viewModel.hitungData(pj, lb, tg)
            tvResult.text = viewModel.hasil.toString()
        }
    }
}