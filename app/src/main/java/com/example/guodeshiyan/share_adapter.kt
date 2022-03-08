package com.example.guodeshiyan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class share_adapter():RecyclerView.Adapter<share_adapter.MViewHolder>()  {
    val list = ArrayList<DataBean>()
    init {
        val d1 = DataBean("QmcK7e5243CWfjdpVge1CUGiwfCX89hUQmzJGE2f6d5bD1","日期: 2020-12-01","大小: 128KB")
        val d2 = DataBean("QmZ4LKb5SLj5uax9U2mRAcaPpRUH2Eq2raQu4F2RKC1uq7","日期: 2020-12-03","大小: 1.6MB")
        val d3 = DataBean("Qmf16q1W369JXHcQ3zbhgyGQSKu53aqwL4gd3L7yzz8DDB","日期: 2020-12-04","大小: 10.5MB")
        val d4 = DataBean("QmQtqmz3BAPL5FU2Z2KBujHpjvSuwaDj47cTB8dsx3mZjL","日期: 2020-12-06","大小: 0.7MB")
        val d5 = DataBean("QmTs5CnVmovAxZ7W7kAJpFeimAMRwodSEetebn2tRcDjiC","日期: 2020-12-10","大小: 564KB")
        val d7 = DataBean("QmQGEfBghAMQ8Aw1y898RucD9qx5h3KkopeUoZWDfmUvKt","日期: 2020-12-11","大小: 78KB")
        val d8 = DataBean("QmfKpETHpjsyhtd7MbxoXNKGxGsy2HX5tJhLqLqZGoCyvp","日期: 2020-12-11","大小: 11.1MB")
        val d9 = DataBean("QmP4Gk2oPEfm3V8ViVjq396dv39bvhSagMetF7CqpHmo58","日期: 2020-12-13","大小: 0.8MB")
        val d10 = DataBean("QmctcVFtKczgZrqsGudNtcLAw3nbuVs4shEQ74GjhJw8tr","日期: 2020-12-13","大小: 11KB")
        list.add(d10)
        list.add(d9)
        list.add(d8)
        list.add(d7)
        list.add(d5)
        list.add(d4)
        list.add(d3)
        list.add(d2)
        list.add(d1)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): share_adapter.MViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_search,parent,false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(holder: share_adapter.MViewHolder, position: Int) {
        val data = list[position]
        holder.hash.text = data.hash
        holder.date.text = data.date
        holder.id.text = data.ID
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val hash = view.findViewById<TextView>(R.id.hash)
        val id = view.findViewById<TextView>(R.id.id)
        val date = view.findViewById<TextView>(R.id.date)
    }


    data class DataBean(val hash:String,val date:String,val ID:String)
}