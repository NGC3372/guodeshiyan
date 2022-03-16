package com.example.guodeshiyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator

class request_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_add)
        recyclerView.adapter = request_adapter()
        recyclerView.itemAnimator

    }






}