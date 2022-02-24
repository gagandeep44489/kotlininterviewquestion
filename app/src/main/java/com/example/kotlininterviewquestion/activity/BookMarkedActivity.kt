package com.example.kotlininterviewquestion.activity
/*
package com.example.kotlininterviewquestion
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager

import com.example.kotlininterviewquestion.room.MyDatabase
import kotlinx.android.synthetic.main.activity_book_marked.*

class Bookmarked : AppCompatActivity() {
    lateinit var myDb: MyDatabase
    var TAG = "VersesActivity"
    var chapterIndex = 0
    var langType = ""

    var listNote = mutableListOf<InterviewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_marked)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        myDb = MyDatabase.getInstance(this@CustomAdapter)
        title = "Bookmarks"

    }

    */
/*override fun onResume() {
        super.onResume()
        listNote = myDb.daoNote().getFavorites(true).toMutableList()
        if(listNote.count() == 0)
        {
            NoBookMark.visibility = View.VISIBLE
        }

        initViews()
    }
*//*

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
    fun initViews() {
        recyclerbook.layoutManager = StaggeredGridLayoutManager(
                2,
                StaggeredGridLayoutManager.VERTICAL
        )
        recyclerbook.adapter = BookMarkedAdapter(AppConstant().gagan())


    }



}*/


import AdapterBookmark
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlininterviewquestion.CustomAdapter
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.R

import com.example.kotlininterviewquestion.room.MyDatabase



class Bookmarked : AppCompatActivity() {
    lateinit var myDb: MyDatabase
    lateinit var ViewModel: InterviewViewModel
    var TAG = "VersesActivity"
    var chapterIndex = 0
    var langType = ""
    var listNote = mutableListOf<InterviewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_marked)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        myDb = MyDatabase.createDatabase(this)
        title = "Bookmarks"

    }

    override fun onResume() {
        super.onResume()
        listNote = myDb.daoInterview().getFavorites(true).toMutableList()
       /* if(listNote.count() == 0)
        {
            NoBookMark.visibility = View.VISIBLE
        }*/

        initViews()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
    private var menu: Menu? = null
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menu = menu;
        menuInflater.inflate(R.menu.interview_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.bookmark -> {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                invalidateOptionsMenu()
            }

            else -> return super.onOptionsItemSelected(item)
        }

        return true
    }
    fun initViews() {
        val recyclerbook = findViewById<RecyclerView>(R.id.recyclerbook)

        recyclerbook.layoutManager = StaggeredGridLayoutManager(
            1,
            StaggeredGridLayoutManager.VERTICAL
        )
        recyclerbook.adapter = AdapterBookmark(listNote, object : AdapterBookmark.ListenersPankti {


            override fun onDeleted(note: InterviewModel, tappedIndex: Int) {
                try {
                    myDb.daoInterview().addToBookmarks(note.id!!,
                        false)
                    listNote.removeAt(tappedIndex)
                    Log.e(TAG, "onDeleted: listNote size: ${listNote.count()}", )


                    recyclerbook.adapter!!.notifyItemRemoved(tappedIndex)
                    recyclerbook.adapter!!.notifyDataSetChanged()

                    /*if(listNote.count() == 0)
                    {
                        NoBookMark.visibility = View.VISIBLE
                    }*/
                } catch (e: Exception) {
                    Log.e(TAG, "onDeleted: error due to : ${e.message}" )
                }


            }

})}}
