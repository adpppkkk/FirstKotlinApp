package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val REAL_URL = "URL"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sendUrl (view: View){
        val editText = findViewById<EditText>(R.id.url)
        val weburl = editText.text.toString()
        val intent = Intent(this, DisplaySomeMoreActivity::class.java).apply {
            putExtra(REAL_URL, weburl)
        }
        startActivity(intent)

    }
}
