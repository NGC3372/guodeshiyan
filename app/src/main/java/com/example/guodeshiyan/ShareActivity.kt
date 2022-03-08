package com.example.guodeshiyan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout

class ShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_add)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = share_adapter()


    }
}