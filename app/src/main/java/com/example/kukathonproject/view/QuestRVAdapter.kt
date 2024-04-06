package com.example.kukathonproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kukathonproject.R
import com.example.kukathonproject.model.QuestItem
import com.example.kukathonproject.model.SecreteCharacterItem

class QuestRVAdapter(val items : MutableList<QuestItem>) : RecyclerView.Adapter<QuestRVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestRVAdapter.ViewHolder {

        // 레이아웃 인플레이터를 사용하여 아이템XML 레이아웃을 가져옴
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_quest, parent, false)

        //아이템XML 레이아웃을 담은 ViewHolder를 생성하고 반환
        return ViewHolder(v)
    }

    // onBindViewHolder: ViewHolder에 데이터(items=데이터클래스)를 바인딩
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // ViewHolder에 현재 위치(position)의 아이템을 바인딩
        holder.bindItems(items[position])
    }

    // getItemCount: 데이터 세트의 아이템 수를 반환
    override fun getItemCount(): Int {

        return items.count()
    }

    //ViewHolder: RecyclerView에서 각 아이템의 뷰를 보유하는 이너클래스
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // bindItems: ViewHolder에 데이터를 바인딩하는 함수
        fun bindItems(items : QuestItem){

            //// XML에서 정의한 뷰들을 아이디를 이용해 가져오기
            val questComment = itemView.findViewById<TextView>(R.id.quset_comment_tv)
            val questComment2 = itemView.findViewById<TextView>(R.id.quset_comment_tv2)
            val questComment3 = itemView.findViewById<TextView>(R.id.quset_comment_tv3)

            //아이템의 데이터로 뷰들을 설정
            //setImageResource : 이미지 넣어주기 위해
            questComment.text = items.quset_comment_tv
            questComment2.text = items.quset_comment_tv2
            questComment3.text = items.quset_comment_tv3
        }
    }
}