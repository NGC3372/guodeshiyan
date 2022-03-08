package com.example.guodeshiyan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView

class search_adapter():RecyclerView.Adapter<search_adapter.MViewHolder>() {
    val list = ArrayList<DataBean>()
    init {
        val d1 = DataBean("QmcK7e5243CWfjdpVge1CUGiwfCX89hUQmzJGE2f6d5bD1","0x76e0eC050466c4dddBbAA25C3f069C18F026AF95","2020-12-01")
        val d2 = DataBean("QmZ4LKb5SLj5uax9U2mRAcaPpRUH2Eq2raQu4F2RKC1uq7","0x76e0eC050466c4dddBbAA25C3f069C18F026AF95","2020-12-03")
        val d3 = DataBean("Qmf16q1W369JXHcQ3zbhgyGQSKu53aqwL4gd3L7yzz8DDB","0x76e0eC050466c4dddBbAA25C3f069C18F026AF95","2020-12-04")
        val d4 = DataBean("QmQtqmz3BAPL5FU2Z2KBujHpjvSuwaDj47cTB8dsx3mZjL","0xE944925751f47bAb4f89427eB08b8E5fE710D126","2020-12-06")
        val d5 = DataBean("QmTs5CnVmovAxZ7W7kAJpFeimAMRwodSEetebn2tRcDjiC","0xE944925751f47bAb4f89427eB08b8E5fE710D126","2020-12-06")
        val d6 = DataBean("QmRpnGqywsGu2ikGBLz5W9f3Trk9Fb88mJuSMiQBydbdw2","0xE944925751f47bAb4f89427eB08b8E5fE710D126","2020-12-10")
        val d7 = DataBean("QmQGEfBghAMQ8Aw1y898RucD9qx5h3KkopeUoZWDfmUvKt","0x9586465A97A4168826ec0e565B89EcCc788b01A5","2020-12-11")
        val d8 = DataBean("QmfKpETHpjsyhtd7MbxoXNKGxGsy2HX5tJhLqLqZGoCyvp","0x9586465A97A4168826ec0e565B89EcCc788b01A5","2020-12-11")
        val d9 = DataBean("QmP4Gk2oPEfm3V8ViVjq396dv39bvhSagMetF7CqpHmo58","0x9586465A97A4168826ec0e565B89EcCc788b01A5","2020-12-13")
        val d10 = DataBean("QmctcVFtKczgZrqsGudNtcLAw3nbuVs4shEQ74GjhJw8tr","0x9586465A97A4168826ec0e565B89EcCc788b01A5","2020-12-13")
        list.add(d10)
        list.add(d9)
        list.add(d8)
        list.add(d7)
        list.add(d6)
        list.add(d5)
        list.add(d4)
        list.add(d3)
        list.add(d2)
        list.add(d1)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): search_adapter.MViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_search,parent,false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(holder: search_adapter.MViewHolder, position: Int) {
        val data = list[position]
        holder.hash.text = data.hash
        holder.date.text = data.date
        holder.id.text = data.ID
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MViewHolder(val view: View) :RecyclerView.ViewHolder(view){
        val hash = view.findViewById<TextView>(R.id.hash)
        val id = view.findViewById<TextView>(R.id.id)
        val date = view.findViewById<TextView>(R.id.date)
    }


    data class DataBean(val hash:String,val date:String,val ID:String)
}