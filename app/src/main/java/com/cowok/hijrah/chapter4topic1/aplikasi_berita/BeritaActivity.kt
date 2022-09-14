package com.cowok.hijrah.chapter4topic1.aplikasi_berita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.chapter4topic1.R
import kotlinx.android.synthetic.main.activity_berita.*

class BeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        var dataBerita = arrayListOf(
            DataBerita(
                "Penjelasan BMKG Soal Cuaca Panas Terik di Indonesia",
                "11 Mei 2022",
                R.drawable.cuaca),
            DataBerita(
                "Momen Jokowi dan Anies Tinjau Lokasi Formula E di Ancol",
                "26 April 2022",
                R.drawable.jokowi_anies),
            DataBerita(
                "Kebakaran Pasar Gembrong, 1000 Jiwa Kehilangan Tempat Tinggal",
                "25 April 2022",
                R.drawable.kebakaran),
            DataBerita(
                "Israel Kembali Serang Palestina di Kompleks Al-Aqsa",
                "19 April 2022",
                R.drawable.israel_palestina),
            DataBerita(
                "Protokol Kesehatan Masuk Bagian Biaya Haji Tahun Ini",
                "15 April 2022",
                R.drawable.protokol_kesehatan),
            DataBerita(
                "Data Penerima Vaksin Covid-19 sampai 13 September 2022",
                "13 September 2022",
                R.drawable.penerima_vaksin),
            DataBerita(
                "Data Kasus & Kematian Covid-19 di Jakarta",
                "13 September 2022",
                R.drawable.kasus_dan_kematian),
            DataBerita(
                "Kasus Positif dan Kematian Covid-19 sampai 13 September 2022",
                "13 September 2022",
                R.drawable.positif_dan_kematian),
            DataBerita(
                "JNE Pastikan Ganti Rugi Rumah Warga yang Terdampak Kebakaran",
                "13 September 2022",
                R.drawable.jne_ganti_rugi),
            DataBerita(
                "Ashabul Kahfi, Kisah Para Pemuda yang Tertidur di Gua Selama 309 Tahun",
                "03 September 2020",
                R.drawable.ashabul_kahfi)
        )

        var adapterBerita = BeritaAdapter(dataBerita)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewBerita.layoutManager = layoutManager
        recyclerViewBerita.adapter = adapterBerita

    }
}