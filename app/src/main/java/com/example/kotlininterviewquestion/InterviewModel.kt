
package com.example.kotlininterviewquestion

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo



@Entity(tableName = "interviewtable", indices = [Index(value = ["index", "istype"], unique = true)])
 class InterviewModel(var index1: Int,
                          var ques1: String,
                          var ans1: String,
                          var isBookMarked1: Boolean,
                          var istype1: String) {


    @PrimaryKey(autoGenerate = true)
 @ColumnInfo(name = "id")

 var id: Int? = null
 var index: Int? = null
 lateinit var ques: String
 lateinit var ans: String
 var isBookMarked: Boolean? = null
 lateinit var istype: String


}

