import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.R

/*
package com.example.kotlininterviewquestion.adapter






import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kotlininterviewquestion.InterviewModel
import com.example.kotlininterviewquestion.R

package com.status.kotlinrecyclerview.activities

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.status.kotlinrecyclerview.R
import com.status.kotlinrecyclerview.pojos.NoteModel
import mcq.punjabi.models.MyDatabase

class AdapterBookmark(private var mData: List<NoteModel>,
                      var listener: ListenersPankti
) : RecyclerView.Adapter<AdapterBookmark.ViewHolder>() {

    lateinit  var latoFont : Typeface
    var TAG  = "AdapterBookmark"

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val view = layoutInflater.inflate(R.layout.item_bookmark, viewGroup, false)
        latoFont = Typeface.createFromAsset(viewGroup.context.assets, "lato_regular.ttf")
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, i: Int) {
        val a = mData[i]

        holder.tvTitle.text = a.pankti
        holder.indexPankti.text = "Chapter: ${a.chapter} > ${a.verse}"
        holder.tvDesc.text = "Click to read"
        holder.layout.setOnClickListener {
            listener.onClicked(a, i)
        }
        holder.tvTitle.typeface = latoFont
        holder.indexPankti.typeface = latoFont
        holder.tvDesc.typeface = latoFont

        holder.deleteIcon.setOnClickListener{
            Log.e(TAG, "onBindViewHolder: tapped getting:$i")
            listener.onDeleted(a, i)
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    interface ListenersPankti {
        fun onClicked(note: NoteModel, tappedIndex: Int)
        fun onDeleted(note: NoteModel, tappedIndex: Int)
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var indexPankti: TextView = itemView.findViewById(R.id.indexPankti)
        var tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        var tvDesc: TextView = itemView.findViewById(R.id.chapter_title)
        v











        ar layout: CardView = itemView.findViewById(R.id.layout)
        var deleteIcon: ImageView = itemView.findViewById(R.id.deleteIcon)

    }
}
*/
class AdapterBookmark(private var mData: List<InterviewModel>,
                      var listener: ListenersPankti
) : RecyclerView.Adapter<AdapterBookmark.ViewHolder>() {

    lateinit var context: Context
    var TAG  = "AdapterBookmark"

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        context = viewGroup.context
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val view = layoutInflater.inflate(R.layout.recycle, viewGroup, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var a = mData[position]
        holder.indextxt.text = "${a.index}."
        holder.questxt.text = a.ques
        holder.anstxt.text = a.ans
        if(mData[position].isBookMarked!!)
        {
            holder.star.setColorFilter(ContextCompat.getColor(context, R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        else
        {
            holder.star.setColorFilter(ContextCompat.getColor(context, R.color.black), android.graphics.PorterDuff.Mode.MULTIPLY);
        }


        holder.star.setOnClickListener{
            Log.e(TAG, "onBindViewHolder: tapped getting:$position")
             listener.onDeleted(a, position)

        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    interface ListenersPankti {

        fun onDeleted(note: InterviewModel, tappedIndex: Int)
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var indextxt: TextView = itemView.findViewById(R.id.indextxt)
        var questxt: TextView = itemView.findViewById(R.id.questxt)
        var  anstxt: TextView = itemView.findViewById(R.id.anstxt)
        var  star: ImageView = itemView.findViewById(R.id.star)

    }
}
