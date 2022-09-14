package com.cowok.hijrah.chapter4topic1.aplikasi_berita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cowok.hijrah.chapter4topic1.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var getDetailBerita = intent.getSerializableExtra("detailBerita") as DataBerita
        textViewDetailJudul.text = getDetailBerita.judul
        textViewDetailTanggal.text = getDetailBerita.tgl
        imageViewDetail.setImageResource(getDetailBerita.img)
        textViewDetailJurnalis.text = getDetailBerita.jurnalis
        textViewIsi.text = getDetailBerita.isi

    }
}