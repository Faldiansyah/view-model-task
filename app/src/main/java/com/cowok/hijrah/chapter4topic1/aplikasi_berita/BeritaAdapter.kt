package com.cowok.hijrah.chapter4topic1.aplikasi_berita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.chapter4topic1.R

class BeritaAdapter(val dataBerita: ArrayList<DataBerita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {
    // ambil id dari layout
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var judulBerita = view.findViewById<TextView>(R.id.textViewBerita)
        var tglBerita = view.findViewById<TextView>(R.id.textViewTanggal)
        var imgBerita = view.findViewById<ImageView>(R.id.imageBerita)
    }

    // buat objek viewholder, regiter view, dan inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    // set data ke layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.judulBerita.text = dataBerita[position].judul
        holder.tglBerita.text = dataBerita[position].tgl
        holder.imgBerita.setImageResource(dataBerita[position].img)
    }

    // jumlah item yang muncul di recycler view
    override fun getItemCount(): Int {
        return dataBerita.size
    }
}