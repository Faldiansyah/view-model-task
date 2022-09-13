package com.cowok.hijrah.chapter4topic1.aplikasi_student

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.cowok.hijrah.chapter4topic1.R

class StudentAdapter(var listStudent: ArrayList<DataStudent>)
    : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    var onClick : ((DataStudent) -> Unit)? = null

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var namaStudent = view.findViewById<TextView>(R.id.tvNama)
        var nimStudent = view.findViewById<TextView>(R.id.tvNim)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)
        var card = view.findViewById<CardView>(R.id.cardList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].image)
        holder.card.setOnClickListener {
            onClick?.invoke(listStudent[position])
        }
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    fun setDataStudentAdapter(studentList: ArrayList<DataStudent>){
        this.listStudent = studentList
    }
}