package com.cowok.hijrah.chapter4topic1.aplikasi_berita

import android.content.Intent
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
                R.drawable.cuaca,
                "Dini Apriliana",
                "Badan Meteorologi Klimatologi dan Geofisika (BMKG) menjelaskan fenomena suhu panas terik yang akhir-akhir ini dirasakan masyarakat di sejumlah wilayah Indonesia. Berdasarkan pengamatan BMKG, suhu maksimum terukur selama periode 1 sampai 7 Mei 2022 berkisar antara 33 derajat sampai 36,1 derajat Celcius."),
            DataBerita(
                "Momen Jokowi dan Anies Tinjau Lokasi Formula E di Ancol",
                "26 April 2022",
                R.drawable.jokowi_anies,
                "Dini Apriliana",
                "Presiden Jokowi bersama Gubernur DKI Jakarta Anies Baswedan mengunjungi sirkuit Formula E Ancol, Jakarta Pusat, Senin (25/4). Keduanya berharap gelaran ajang balap mobil listrik 2022 itu dapat berlangsung sesuai jadwal dan dihadiri oleh banyak penonton."),
            DataBerita(
                "Kebakaran Pasar Gembrong, 1000 Jiwa Kehilangan Tempat Tinggal",
                "25 April 2022",
                R.drawable.kebakaran,
                "Dini Apriliana",
                "Sebanyak 400 bangunan yang terdiri dari rumah dan pertokoan, terbakar di Pasar Gembrong, Jakarta Timur, Minggu (24/4) malam. Setidaknya 45 keluarga dengan sekitar 1000 jiwa pun kehilangan tempat tinggal. Adapun kerugian kebakaran ditaksir mencapai Rp 1,5 miliar."),
            DataBerita(
                "Israel Kembali Serang Palestina di Kompleks Al-Aqsa",
                "19 April 2022",
                R.drawable.israel_palestina,
                "Dini Apriliana",
                "Israel kembali menyerang Palestina di bulan Ramadan. Kali ini Kompleks Masjid Al-Aqsa Yerusalem kembali menjadi lokasi bentrok antara warga Palestina dan polisi Israel. Setidaknya 150 warga Palestina terluka akibat serangan itu. Kejadian di kompleks Masjidil Aqsa saat bulan puasa bukan pertama kalinya terjadi."),
            DataBerita(
                "Protokol Kesehatan Masuk Bagian Biaya Haji Tahun Ini",
                "15 April 2022",
                R.drawable.protokol_kesehatan,
                "Dini Apriliana",
                "Pemerintah dan DPR sepakat menetapkan biaya haji tahun ini sebesar Rp 39.886.009. Angka ini disampaikan Menteri Agama Yaqut Cholil Qoumas dalam rapat kerja dengan Komisi VIII DPR RI, di Senayan, Jakarta, Rabu (13/4)."),
            DataBerita(
                "Data Penerima Vaksin Covid-19 sampai 13 September 2022",
                "13 September 2022",
                R.drawable.penerima_vaksin,
                "Dionisius Bisara",
                ""),
            DataBerita(
                "Data Kasus & Kematian Covid-19 di Jakarta",
                "13 September 2022",
                R.drawable.kasus_dan_kematian,
                "Dionisius Bisara",
                ""),
            DataBerita(
                "Kasus Positif dan Kematian Covid-19 sampai 13 September 2022",
                "13 September 2022",
                R.drawable.positif_dan_kematian,
                "Dionisius Bisara",
                ""),
            DataBerita(
                "JNE Pastikan Ganti Rugi Rumah Warga yang Terdampak Kebakaran",
                "13 September 2022",
                R.drawable.jne_ganti_rugi,
                "Dionisius Bisara",
                "Pihak JNE berjanji akan melakukan ganti rugi terhadap warga yang terdampak kebakaran gudang JNE di Jalan Pekapuran, Cimanggis, Depok, Senin (12/9/2022). Hal tersebut disampaikan langsung oleh Head of Media Relation Department JNE, Kurnia Nugraha dalam siaran pers, Selasa (13/9/22). Kurnia menyampaikan, kerugian yang dialami warga seperti kerusakan rumah dan barang dipastikan akan diganti oleh JNE. “Kami bertanggung jawab ke warga sekitar yang terdampak langsung atas kejadian kemarin,” katanya. Dikatakan Kurnia, JNE tidak akan luput dari tanggung jawab atas musibah yang terjadi kemarin. Hingga saat ini pihaknya masih melakukan upaya koordinasi dengan sejumlah pihak. “Untuk warga yang terdampak langsung atas kejadian kami bertanggung jawab. Terkait barang-barang yang terdampak langsung juga saat ini tim kami sedang melakukan koordinasi lebih lanjut,” tuturnya."),
            DataBerita(
                "Ashabul Kahfi, Kisah Para Pemuda yang Tertidur di Gua Selama 309 Tahun",
                "03 September 2020",
                R.drawable.ashabul_kahfi,
                "Lusiana Mulsinda",
                "Ashabul kahfi merupakan kisah tujuh pemuda yang tertidur di dalam gua selama 309 tahun. Kisah ini terjadi sebelum zaman nabi Muhammad SAW. Para pemuda ini bersembunyi di dalam Gua Rajib yang lokasinya berada sekitar 8 kilometer dari Amman, Yordania untuk melarikan diri dari kekejaman Raja Dikyanus. Cerita tentang ashabul kahfi ini berawal dari sebuah negeri bernama Afasus yang dipimpin oleh raja kejam dan penyembah berhala bernama Raja Decyanus. Ia tak segan-segan membunuh siapa saja yang menolak untuk menyembah berhala. Mengutip dari buku 'Kisah-kisah dalam Surah Al-Kahf' oleh Angga Mulyana, suatu ketika Raja Decyanus mendengar ada beberapa pemuda yang menolak menyembah berhala. Ketika ditanya, alasan pemuda-pemuda ini menolak menyembah berhala adalah karena hanya ingin beribadah kepada Allah SWT. Nama 7 pemuda ashabul kahfi adalah Maxalmena, Martinus, Kastunus, Bairunus, Danimus, Yathbunus dan Thamlika. Ditawarkan berbagai kenikmatan, pemuda ini tetap menolak. Sampai pada akhirnya pemuda-pemuda ini sepakat untuk pergi meninggalkan kota mereka dan bersembunyi di sebuah gua. Di gua tersebut, para pemuda bisa dengan bebas beribadah kepada Allah dan selalu berdoa untuk memohon perlindungan agar terhindar dari kejaran tentara Raja Decyanus.")
        )

        var adapterBerita = BeritaAdapter(dataBerita)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewBerita.layoutManager = layoutManager
        recyclerViewBerita.adapter = adapterBerita

        adapterBerita.onClick = {
            var toDetail = Intent(this, DetailActivity::class.java)
            toDetail.putExtra("detailBerita", it)
            startActivity(toDetail)
        }

    }
}