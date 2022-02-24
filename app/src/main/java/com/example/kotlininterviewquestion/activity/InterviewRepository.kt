package com.example.kotlininterviewquestion.activity

import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.room.MyDatabase

class InterviewRepository(private val db: MyDatabase) {


        suspend fun interviewinsert(item: InterviewModel) = db.daoInterview().interviewinsert(item)
        suspend fun interviewdelete(item: InterviewModel) = db.daoInterview().interviewdelete(item)

        /*fun allInterviewItems() = db.daoInterview().getAllInterviewItems()*/
    }
