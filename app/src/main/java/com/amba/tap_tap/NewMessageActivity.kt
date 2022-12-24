package com.amba.tap_tap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder



class NewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var recyclerview_newmessage = RecyclerView(this)
        setContentView(R.layout.activity_new_message)

        supportActionBar?.title = "Select User"




    }
}