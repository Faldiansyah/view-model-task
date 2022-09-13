package com.cowok.hijrah.chapter4topic1.aplikasi_student

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cowok.hijrah.chapter4topic1.R

class StudentViewModel: ViewModel() {
    val listStudent = arrayListOf(
        DataStudent("Andika", "F55129867", R.drawable.ic_launcher_foreground),
        DataStudent("Sinta", "A55124545", R.drawable.ic_launcher_foreground),
        DataStudent("Dandi", "B55120987", R.drawable.ic_launcher_foreground),
        DataStudent("Citra", "D55120900", R.drawable.ic_launcher_foreground),
        DataStudent("Rangga", "L55120002", R.drawable.ic_launcher_foreground),
    )

    val dataListStudent: MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudent(){
        var murid = listStudent
        dataListStudent.value = murid
    }
}