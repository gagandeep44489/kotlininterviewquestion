package com.example.kotlininterviewquestion.room


import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.kotlininterviewquestion.InterviewModel

@Dao
interface DaoInterview {
        @Insert(onConflict = REPLACE)
         fun interviewinsert(item: InterviewModel)

        // Delete function is used to
        // delete data in database.
        @Delete
         fun interviewdelete(item: InterviewModel)

        // getAllGroceryItems function is used to get
        // all the data of database.
        @Query("SELECT * FROM interviewtable WHERE istype = :isFavorited" )
        fun getAllInterviewItems(isFavorited: String): List<InterviewModel>
    @Query("UPDATE interviewtable SET isBookMarked = :isLiked WHERE id=  :id " )
    fun addToBookmarks(id: Int, isLiked: Boolean)
    @Query("SELECT * from interviewtable WHERE istype = :istype AND isBookMarked = :isFavorited  ORDER BY id ASC")
    fun getFavorites(istype: String,isFavorited: Boolean): List<InterviewModel>
   /* @Query("UPDATE interviewtable SET isBookMarked = :isFavorited WHERE id = :id")
    fun addToFavorites(id: Int, isFavorited: Boolean)*/

}
        /*@Insert(onConflict = OnConflictStrategy.REPLACE)*/
       /* fun insertInterview(data: InterviewModel)*/


       /* @Update
        fun update(data: InterviewModel): Int*/

        /*@Query("SELECT * from interviewtable WHERE isFavorite = :isFavorited ORDER BY id ASC")
        fun getFavorites(isFavorited: Boolean): List<NoteModel>




 @Query("SELECT * from bhagvadGeetaTable WHERE chapter = :chapter AND languageType = :languageType ORDER BY id ASC")
        fun getVersesOfChapter(chapter: String, languageType: String): List<NoteModel>*/


       /* @Query("SELECT * FROM INTERVIEWTABLE WHERE id = :id LIMIT 1")
        fun getNote(id: Int?): InterviewModel

        @Query("DELETE FROM interviewtable")
        fun deleteAll()*/



/*
 @Query("UPDATE bhagvadGeetaTable SET isFavorite = :isFavorited WHERE id = :id")
        fun addToFavorites(id: Int, isFavorited: Boolean)*/






        //for audios
/*@Insert(onConflict = REPLACE)
        fun insertAudio(data: AudioItem)

        @Query("SELECT * FROM audiosTable")
        fun getAudios(): List<AudioItem>*/


/*

 @Query("DELETE FROM note")
         fun deleteAll(): Int
*/




