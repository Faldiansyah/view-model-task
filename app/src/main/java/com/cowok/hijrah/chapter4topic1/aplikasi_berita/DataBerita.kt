package com.cowok.hijrah.chapter4topic1.aplikasi_berita

import java.io.Serializable

data class DataBerita(
    val judul: String,
    val tgl: String,
    val img: Int,
    val jurnalis: String,
    val isi: String
): Serializable