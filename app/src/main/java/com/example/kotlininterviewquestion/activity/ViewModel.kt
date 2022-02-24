package com.example.kotlininterviewquestion.activity

import androidx.lifecycle.ViewModel
import com.example.kotlininterviewquestion.InterviewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class InterviewViewModel(private val repository: InterviewRepository) : ViewModel() {

    // In coroutines thread insert item in insert function.
    fun interviewinsert(item: InterviewModel) = GlobalScope.launch {
        repository.interviewinsert(item)
    }

    // In coroutines thread delete item in delete function.
    fun interviewdelete(item: InterviewModel) = GlobalScope.launch {
        repository.interviewdelete(item)
    }

    //Here we initialized allGroceryItems function with repository
/*fun allInterviewItems() = repository.allInterviewItems()*/

}