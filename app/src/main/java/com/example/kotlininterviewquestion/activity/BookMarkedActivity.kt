package com.example.kotlininterviewquestion.activity
/*
package com.example.k+otlininterviewquestion
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
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.*
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.kotlininterviewquestion.CustomAdapter
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.R

import com.example.kotlininterviewquestion.room.MyDatabase



class Bookmarked : AppCompatActivity() {
    lateinit var myDb: MyDatabase
    lateinit var ViewModel: InterviewViewModel
     var check:Int? = null
    var check1:Int? = null
    var listNote1 = mutableListOf<InterviewModel>()

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

        setViewPagerListener()

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
        when (item.itemId) {
            R.id.bookmark -> {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                invalidateOptionsMenu()
            }

            else -> return super.onOptionsItemSelected(item)
        }

        return true
    }
    override fun onResume(){
        super.onResume()

        when (check){
            0->listNote = myDb.daoInterview().getFavorites("kotlin", true).toMutableList()
            1->listNote = myDb.daoInterview().getFavorites("java", true).toMutableList()

        }
        if(check==0){
            var x = "this is just check"
            Log.e(TAG, "onResume: "+ x )
        }

        setViewPagerListener()
    }

    fun setViewPagerListener() {
        var ultra_viewpager = findViewById<ViewPager>(R.id.ultra_viewpager)

        val adapter: PagerAdapter = UltraPagerAdapter(false)
        ultra_viewpager!!.adapter = adapter





            /* ultra_viewpager!!.adapter.notifyDataSetChanged()*/

            ultra_viewpager!!.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {


                }

                override fun onPageSelected(position: Int) {





                when(position){
                    0-> check=0
                    1-> check=1

                }
                    if(position==0) {
                        Log.e(TAG, "onPageSelected this just chekcing of check1: "+ check )


                    }
                    if(position==1){
                        Log.e(TAG, "onPageSelected this just chekcing of check2: "+ check )
                    }


                    /*  String d=arrayList.get(position).getId();
                            Log.e(TAG, "onPageSelected: Position:"+position +" d:  "+d);
                            idOfImage=d;
                            linkImageString=arrayList.get(position).getLink();*/
                }

                override fun onPageScrollStateChanged(state: Int) {
                    Log.e(TAG, "onPageScrollStateChanged: state:$state")
                }
            })

        }

        fun share(view: View?) {
            // Constants.shareAppp(ViewImage.this);
        }


    private var textToSpeech: TextToSpeech? = null

    fun like(view: View?) {}
    internal inner class UltraPagerAdapter(private val isMultiScr: Boolean) : PagerAdapter() {
        override fun getCount(): Int {
            return 2
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view === `object`
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {




            val layoutInflater = LayoutInflater.from(this@Bookmarked)
            val rootview = layoutInflater.inflate(R.layout.recyclerview, null)
            Log.e(TAG, "instantiateItem: this is checking first and last time " + rootview)
            val recyclerbook =
                rootview.findViewById<View>(R.id.recyclerview) as? RecyclerView

            Log.e(TAG, "instantiateItem: this is checking second time: ")


            recyclerbook?.layoutManager = LinearLayoutManager(this@Bookmarked)

     /*       fun onResume() {
                super.onResume()



                when(position) {

                    0-> listNote = myDb.daoInterview().getFavorites("kotlin",true).toMutableList()
                    1-> listNote = myDb.daoInterview().getFavorites("java",true).toMutableList()
                }



                        setViewPagerListener()

            }

      */
            if(position==0) {
                myDb = MyDatabase.createDatabase(this@Bookmarked)
                listNote = myDb.daoInterview().getFavorites("kotlin", true).toMutableList()
                Log.e(TAG, "onPageSelected: " + listNote)



                recyclerbook?.adapter =
                    AdapterBookmark(listNote, object : AdapterBookmark.ListenersPankti {


                        override fun onDeleted(note: InterviewModel, tappedIndex: Int) {
                            try {
                                myDb.daoInterview().addToBookmarks(
                                    note.id!!,
                                    false


                                )
                                Log.e(TAG, "onDeleted: " + listNote)



                                listNote.remove(note)










                                Log.e(TAG, "onDeleted: listNote size: ${listNote.count()}",)



                                recyclerbook?.adapter!!.notifyItemRemoved(tappedIndex)

                                recyclerbook?.adapter!!.notifyDataSetChanged()


                                /*if(listNote.count() == 0)
                                {
                                    NoBookMark.visibility = View.VISIBLE
                                }*/
                            } catch (e: Exception) {
                                Log.e(TAG, "onDeleted: error due to : ${e.message}")
                            }


                        }


                    }


                    )
            }
            if(position==1) {
                myDb = MyDatabase.createDatabase(this@Bookmarked)
                listNote1 = myDb.daoInterview().getFavorites("java", true).toMutableList()
                Log.e(TAG, "onPageSelected two: " + listNote)


                recyclerbook?.adapter =
                    AdapterBookmark(listNote1, object : AdapterBookmark.ListenersPankti {


                        override fun onDeleted(note: InterviewModel, tappedIndex: Int) {
                            try {
                                myDb.daoInterview().addToBookmarks(
                                    note.id!!,
                                    false


                                )
                                Log.e(TAG, "onDeleted two: " + listNote)



                                listNote1.remove(note)










                                Log.e(TAG, "onDeleted: listNote size: ${listNote.count()}",)



                                recyclerbook?.adapter!!.notifyItemRemoved(tappedIndex)

                                recyclerbook?.adapter!!.notifyDataSetChanged()


                                /*if(listNote.count() == 0)
                                {
                                    NoBookMark.visibility = View.VISIBLE
                                }*/
                            } catch (e: Exception) {
                                Log.e(TAG, "onDeleted: error due to : ${e.message}")
                            }


                        }


                    }


                    )


            }

                container.addView(rootview)
            return rootview


        }



        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            val view = `object` as View
            container.removeView(view)
        }
    }
}
