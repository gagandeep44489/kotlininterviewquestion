package com.example.kotlininterviewquestion.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class InterviewViewModelFactory (private val repository: InterviewRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return InterviewViewModel(repository) as T
    }
}