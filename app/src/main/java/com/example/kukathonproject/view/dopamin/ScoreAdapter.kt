package com.example.kukathonproject.view.dopamin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kukathonproject.R
import com.example.kukathonproject.model.usingItem

class ScoreAdapter(private val itemList: List<usingItem>): RecyclerView.Adapter<ScoreAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mainImg: ImageView = view.findViewById(R.id.main_img)
        val appname: TextView = view.findViewById(R.id.app_name)
        val timeImg: ImageView = view.findViewById(R.id.time_img)
        val time: TextView = view.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dopamin_using, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScoreAdapter.ViewHolder, position: Int) {
        val item = itemList[position]
        holder.mainImg.setImageResource(item.mainImgId)
        holder.appname.text = item.appname
        holder.timeImg.setImageResource(item.usingtImg)
        holder.time.text = item.usingtime
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}