package com.example.kotlininterviewquestion.activity


import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlininterviewquestion.BuildConfig
import com.example.kotlininterviewquestion.R


class Splash : AppCompatActivity() {
    lateinit var  sharedPref : SharedPreferences
    lateinit var  editor: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        sharedPref = getPreferences(Context.MODE_PRIVATE)
        editor = sharedPref.edit()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    fun likedbtn(view: View) {
        intent = Intent(this, Bookmarked::class.java)
        startActivity(intent)



    }
    fun quesbtn(view: View) {

        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun sharebtn(view: View) {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
            var shareMessage = "\nLet me recommend you this application\n\n"
            shareMessage =
                """
                ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
                
                
                """.trimIndent()
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "choose one"))
        } catch (e: Exception) {
            //e.toString();
        }
    }
    fun ratebtn(view: View) {
        val uri = Uri.parse("market://details?id=$packageName")
        val myAppLinkToMarket = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(myAppLinkToMarket)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "Impossible to find an application for the market", Toast.LENGTH_LONG).show()
        }
    }
}