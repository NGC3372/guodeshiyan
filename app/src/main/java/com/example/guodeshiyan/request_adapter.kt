package com.example.guodeshiyan

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class request_adapter():RecyclerView.Adapter<request_adapter.MViewHolder>() {
    val list = ArrayList<mData>();

    init {
        val d1 = mData("Qmd9DseMQErD8QMqFnEGBLbp4UCGCqNi86PDnPiUuW4hqc","0x35c8A50D40D60EC5FdDe0d43a871b8969C026272",
        "请求状态","2020-12-01",0)
        val d2 = mData("QmWUKTGSYySNp76a8nDdHN8YP5gNdoB4Kr3DUexVpCbocS","0x432A02b7E9019b82eC6258dE4F4f4b95cE3d0795",
            "响应接收","2020-12-02",0)
        val d3 = mData("QmTiMVaTcxGBZHv9wtjyw39eHJiqyUjgypAmyEQPuLzARZ","0xF5B2b3Fa34eb3D6D9a7915CEcA58b8847944C1EA",
            "请求状态","2020-12-02",1)
        val d4 = mData("QmavpQNSpzKV3djpdxeqyUiz2oM9DfaCbUUeuyCryGMcHm","0x35c8A50D40D60EC5FdDe0d43a871b8969C026272",
            "完成状态","2020-12-05",1)
        val d5 = mData("QmRLUqXEog67Lz2NkXDDusCCkPGozQoMYQJdBkn8H66QdM","0x432A02b7E9019b82eC6258dE4F4f4b95cE3d0795",
            "完成状态","2020-12-06",0)
        val d6 = mData("Qmbfs4vuXQnSRnqR4vUByG5hZiqGoXy3Uu9p5j8VuAKH3W","0xF5B2b3Fa34eb3D6D9a7915CEcA58b8847944C1EA",
            "代理重加密状态","2020-12-06",1)
        val d7 = mData("QmSJHmUs31M5LiKwQ5DrtHGny1xdrgkdPnV7vPvZ6w1Q1k","0xe4862cA8FE2E4c0D0F0A1f6Dd7C68088be519Cd0",
            "密钥生成状态","2020-12-10",0)
        val d8 = mData("QmSeR8jK4rE2szpQ9W5uXqDtMCaQFDB2EGp9H89fDXSyxv","0xe4862cA8FE2E4c0D0F0A1f6Dd7C68088be519Cd0",
            "响应接收","2020-12-12",1)
        list.add(d1)
        list.add(d2)
        list.add(d3)
        list.add(d4)
        list.add(d5)
        list.add(d6)
        list.add(d7)
        list.add(d8)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_request,parent,false)
        return MViewHolder(view)
    }

    //请求状态、响应接收状态、代理重加密状态、零知识证明身份验证状态、接收下载状态以及完成状态

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MViewHolder, position: Int) {
        val data = list[position]
        holder.date.text = data.date
        holder.id.text = data.id
        holder.hash.text = data.hash
        holder.state.text = data.state
        when(data.state){
            "请求状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.purple_200))
            "响应接收"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.purple_500))
            "代理重加密状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.purple_700))
            "零知识证明身份验证状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.teal_200))
            "接收下载状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.teal_700))
            "密钥生成状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.purple_200))
            "完成状态"->holder.state.setTextColor(holder.itemView.resources.getColor(R.color.red))
        }
        when(data.image){
            0->holder.image.setImageResource(R.drawable.tu_jishi)
            1->holder.image.setImageResource(R.drawable.tu_yanshi)
        }


    }


    override fun getItemCount(): Int {
        return list.size
    }


    class MViewHolder(private val view:View):RecyclerView.ViewHolder(view){
        val hash = view.findViewById<TextView>(R.id.hash)
        val id = view.findViewById<TextView>(R.id.id)
        val state = view.findViewById<TextView>(R.id.state)
        val date = view.findViewById<TextView>(R.id.date)
        val image = view.findViewById<ImageView>(R.id.image)

    }

    data class mData(var hash:String, var id:String, var state:String , var date:String,var image:Int )
}