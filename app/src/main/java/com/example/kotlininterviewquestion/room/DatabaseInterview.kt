
package com.example.kotlininterviewquestion.room
/*
import android.content.Context
import androidx.room.Database

import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlininterviewquestion.CustomAdapter
import com.example.kotlininterviewquestion.InterviewModel



@Database(version = 1,
    entities = [InterviewModel::class])

    abstract class MyDatabase : RoomDatabase() {
        abstract fun daoInterview(): DaoInterview // DaoNote

        companion object {
            private var INSTANCE: MyDatabase? = null
            private val lock = Any()

            fun getInstance(context: Context): MyDatabase {
                if (INSTANCE == null) {
                    synchronized(lock) {
                        INSTANCE = Room.databaseBuilder(
                                context,
                                MyDatabase::class.java, "bhagvadGeetaDB" // Database Name
                        ).allowMainThreadQueries().build()
                    }
                }
                return INSTANCE!!
            }


            fun destroyInstance() {
                INSTANCE = null
            }

        }
    }
*/
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.room.DaoInterview


@Database(entities = [InterviewModel::class], version = 3,exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

    abstract fun daoInterview(): DaoInterview

    companion object {
        @Volatile
        private var instance: MyDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                MyDatabase::class.java,
                "GroceryDatabase.db"
            ).allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

        fun destroyInstance() {
            instance = null
        }
    }
}
