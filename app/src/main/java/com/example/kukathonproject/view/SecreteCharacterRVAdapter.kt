package com.example.kukathonproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kukathonproject.R
import com.example.kukathonproject.model.SecreteCharacterItem

class SecreteCharacterRVAdapter(val items : MutableList<SecreteCharacterItem>, private val listener: OnItemClickListener) : RecyclerView.Adapter<SecreteCharacterRVAdapter.ViewHolder>()
{

    interface OnItemClickListener {
        fun onItemClick(item: SecreteCharacterItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecreteCharacterRVAdapter.ViewHolder {

        // 레이아웃 인플레이터를 사용하여 아이템XML 레이아웃을 가져옴
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_secrete_character, parent, false)

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

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = items[position]
                    listener.onItemClick(item)
                }
            }
        }

        // bindItems: ViewHolder에 데이터를 바인딩하는 함수
        fun bindItems(items : SecreteCharacterItem){

            //// XML에서 정의한 뷰들을 아이디를 이용해 가져오기
            val tool = itemView.findViewById<ImageView>(R.id.item_tool_iv)
            val tool2 = itemView.findViewById<ImageView>(R.id.item_tool_iv2)

            //아이템의 데이터로 뷰들을 설정
            //setImageResource : 이미지 넣어주기 위해
            tool.setImageResource(items.item_tool_iv)
            tool2.setImageResource(items.item_tool_iv2)
        }
    }

}