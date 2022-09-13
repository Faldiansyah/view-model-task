package com.cowok.hijrah.chapter4topic1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel: ViewModel() {
    val listStudent = arrayListOf(
        ListStudent("Andika", "F55129867", R.drawable.ic_launcher_foreground),
        ListStudent("Sinta", "A55124545", R.drawable.ic_launcher_foreground),
        ListStudent("Dandi", "B55120987", R.drawable.ic_launcher_foreground),
        ListStudent("Citra", "D55120900", R.drawable.ic_launcher_foreground),
        ListStudent("Rangga", "L55120002", R.drawable.ic_launcher_foreground),
    )

    val dataListStudent: MutableLiveData<List<ListStudent>> = MutableLiveData()

    fun getStudent(){
        var murid = listStudent
        dataListStudent.value = murid
    }
}