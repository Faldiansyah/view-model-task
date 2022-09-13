package com.cowok.hijrah.chapter4topic1.aplikasi_volbal

import androidx.lifecycle.ViewModel

class BalokViewModel: ViewModel() {

    var hasil = 0
    fun hitungData(panjang: Int, lebar: Int, tinggi: Int){
        hasil = panjang * lebar * tinggi
    }
}