
package com.example.kotlininterviewquestion.activity

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.kotlininterviewquestion.AppConstant
import com.example.kotlininterviewquestion.CustomAdapter
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.R
import com.example.kotlininterviewquestion.room.MyDatabase


class MainActivity : AppCompatActivity() {

    var TAG = "MainActivity"
    lateinit var myDb: MyDatabase
    lateinit var roomDb: MyDatabase
    var interview: InterviewModel? = null
    lateinit var arraylist: ArrayList<InterviewModel>
    lateinit var customAdapter: CustomAdapter
    var isChecked: Boolean? = null
    lateinit var interviewList: MutableList<InterviewModel>
    lateinit var viewpager: ViewPager


    lateinit var ViewModel: InterviewViewModel
    lateinit var mData: List<InterviewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myDb = MyDatabase.createDatabase(this@MainActivity)


        val interviewRepository = InterviewRepository(MyDatabase(this))
        val factory = InterviewViewModelFactory(interviewRepository)

        // Initialised View Model
        ViewModel = ViewModelProvider(this, factory).get(InterviewViewModel::class.java)
        setContentView(R.layout.activity_main)


        var sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        var editor = sharedPreferences.edit()

        if (sharedPreferences.getBoolean("gagan", true)) {
            arraylist = AppConstant().gagan()
            insertIntoLocal()
            Log.e(TAG, "onCreate this is checking third party: ")
        }
        editor.putBoolean("gagan", false).commit()
        if (sharedPreferences.getBoolean("java", true)) {
            arraylist = AppConstant().java()
            insertIntoLocal1()
            Log.e(TAG, "onCreate this is checking third party: ")
        }
        editor.putBoolean("java", false).commit()

        Log.e(TAG, "onCreate: what is problem")

        setViewPagerListener()
/*
         customAdapter = CustomAdapter(


            listOf(), ViewModel,object : CustomAdapter.ListenersAudio {*/






        // this creates a vertical layout Manager

        /*
        if (sharedPreferences.getBoolean("java", true)) {
            arraylist = AppConstant().java()
            insertIntoLocal1()
            Log.e(TAG, "onCreate this is checking third party: ")
        }
        editor.putBoolean("gagan", false).commit()*/
        Log.e(TAG, "this is checkig: ")


    }


    // To display all items in recycler view
    /*  ViewModel.allInterviewItems().observe(this , Observer {
                 customAdapter.mData = it

                 customAdapter.notifyDataSetChanged()

             })*/


    private var menu: Menu? = null
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menu = menu;
        menuInflater.inflate(R.menu.interview_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bookmark -> {
                intent = Intent(this, Bookmarked::class.java)
                startActivity(intent)

                invalidateOptionsMenu()
            }

            else -> return super.onOptionsItemSelected(item)
        }

        return true
    }

    fun insertIntoLocal1() {
        myDb = MyDatabase.createDatabase(this@MainActivity)
        Log.e(TAG, "insertIntoLocal1: this first database")





        for (i in 0..17) {
            interview = InterviewModel(
                arraylist.get(i).index1,
                arraylist.get(i).ques1,
                arraylist.get(i).ans1,
                arraylist.get(i).isBookMarked1,
                arraylist.get(i).istype1

            )

            interview!!.index = arraylist.get(i).index1
            interview!!.ques = arraylist.get(i).ques1
            interview!!.ans = arraylist.get(i).ans1
            interview!!.isBookMarked = arraylist.get(i).isBookMarked1
            interview!!.istype = arraylist.get(i).istype1
            Log.e(TAG, "insertIntoLocal we are checking1: " + interview!!)
            myDb.daoInterview().interviewinsert(interview!!)


            // Initialised View Model


            // on ClickListener on button to open dialog box


        }

    }
    fun insertIntoLocal() {


        myDb = MyDatabase.createDatabase(this@MainActivity)





        for (i in 0..31) {
            interview = InterviewModel(
                arraylist.get(i).index1,
                arraylist.get(i).ques1,
                arraylist.get(i).ans1,
                arraylist.get(i).isBookMarked1,
                arraylist.get(i).istype1

            )

            interview!!.index = arraylist.get(i).index1
            interview!!.ques = arraylist.get(i).ques1
            interview!!.ans = arraylist.get(i).ans1
            interview!!.isBookMarked = arraylist.get(i).isBookMarked1
            interview!!.istype = arraylist.get(i).istype1
            Log.e(TAG, "insertIntoLocal we are checking 2: " + interview!!)
            myDb.daoInterview().interviewinsert(interview!!)


            // Initialised View Model


            // on ClickListener on button to open dialog box


        }
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
        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> {
                    return "Kotlin Question"
                }
                1 -> {
                    return "Java Question"
                }
            }
            return super.getPageTitle(position)
        }






        override fun instantiateItem(container: ViewGroup, position: Int): Any {


            val layoutInflater = LayoutInflater.from(this@MainActivity)
           val  rootview = layoutInflater.inflate(R.layout.recyclerview, null)
            Log.e(TAG, "instantiateItem: this is checking first and last time "+rootview )
            val recyclerview= rootview.findViewById<View>(R.id.recyclerview) as? RecyclerView

            Log.e(TAG, "instantiateItem: this is checking second time: "+ recyclerview )


            recyclerview?.layoutManager = LinearLayoutManager(this@MainActivity)
            when (position) {



                0 -> interviewList=myDb.daoInterview().getAllInterviewItems("kotlin").toMutableList()
                1 -> interviewList=myDb.daoInterview().getAllInterviewItems("java").toMutableList()
            }





            Log.e(TAG, "instantiateItem: we are checking 1" + interviewList)


            recyclerview?.adapter = CustomAdapter(interviewList, object : CustomAdapter.ListenersAudio {

                override fun starTapped(note: InterviewModel, tappedIndex: Int) {
                    roomDb = MyDatabase.createDatabase(this@MainActivity)
                    roomDb.daoInterview().addToBookmarks(
                        note.id!!,
                        note.isBookMarked!!



                    )

                    Log.e(TAG, "starTapped: " + note.id!!)
                    Log.e(TAG, "starTapped: " + note.isBookMarked!!)

                }
            }

            )




            //                    (View)LayoutInflater.from(container.getContext())
//                            .inflate(R.layout.view_image, null);
            //initialization
            Log.e(TAG, "starTapped we are doing a checking: " + recyclerview)
          container.addView(rootview)
            return rootview

        }
        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            val view = `object` as View
            container.removeView(view)
        }



    }
}




