package com.example.kotlininterviewquestion


import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlininterviewquestion.activity.InterviewViewModel
import com.example.kotlininterviewquestion.room.MyDatabase

import java.lang.Boolean.getBoolean


class CustomAdapter(var mData: List<InterviewModel>,
                    /*val viewModel: InterviewViewModel,*/ var listener: ListenersAudio
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    lateinit var context: Context
    lateinit var view: View

    var TAG = "AudioAdapter"
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        context = viewGroup.context

        val layoutInflater = LayoutInflater.from(viewGroup.context)
        view = layoutInflater.inflate(R.layout.recycle, viewGroup, false)


        return ViewHolder(view)



    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val a = mData[position]
        Log.e(TAG, "starTappedchecked: " + a.isBookMarked)

        holder.indextxt.text = "${a.index}."
        holder.questxt.text = a.ques
        holder.anstxt.text = a.ans
        if (mData[position].isBookMarked!!) {
            holder.star.setColorFilter(
                ContextCompat.getColor(context, R.color.red),
                android.graphics.PorterDuff.Mode.MULTIPLY
            );
        } else {
            holder.star.setColorFilter(
                ContextCompat.getColor(context, R.color.black),
                android.graphics.PorterDuff.Mode.MULTIPLY
            );
        }

        fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            val view = `object` as View
            container.removeView(view)
        }





        holder.star.setOnClickListener {

            if (a.isBookMarked!!) {
                holder.star.setColorFilter(
                    ContextCompat.getColor(context, R.color.black),
                    android.graphics.PorterDuff.Mode.MULTIPLY
                );
                a.isBookMarked = false
            } else {
                holder.star.setColorFilter(
                    ContextCompat.getColor(
                        context, R.color.red
                    ),
                    android.graphics.PorterDuff.Mode.MULTIPLY
                );
                a.isBookMarked = true
            }

            // if(holder.star.tint)
            listener.starTapped(a, position)

        }

    }


    override fun getItemCount(): Int {
        return mData.size
    }

    interface ListenersAudio {
        /* fun gaganTapped(note: AudioItem, tappedIndex: Int)*/
        fun starTapped(note: InterviewModel, tappedIndex: Int)
        /*fun onDeleted(note: InterviewModel, tappedIndex: Int)*/
    }


    /* interface ListenersAudio {

        fun starTapped(note: InterviewModel, tappedIndex: Int)
    }
*/
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var indextxt: TextView = itemView.findViewById(R.id.indextxt)
        var questxt: TextView = itemView.findViewById(R.id.questxt)
        var anstxt: TextView = itemView.findViewById(R.id.anstxt)
        var star: ImageView = itemView.findViewById(R.id.star)

    }
}



