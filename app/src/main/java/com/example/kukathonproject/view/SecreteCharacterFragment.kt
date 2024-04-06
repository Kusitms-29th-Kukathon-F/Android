package com.example.kukathonproject.view

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kukathonproject.R
import com.example.kukathonproject.base.BaseFragment
import com.example.kukathonproject.databinding.FragmentHomeBinding
import com.example.kukathonproject.databinding.FragmentSecreteCharacterBinding
import com.example.kukathonproject.model.SecreteCharacterItem

class SecreteCharacterFragment: BaseFragment<FragmentSecreteCharacterBinding>(FragmentSecreteCharacterBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
    }

    private fun initRecycler(){

        // RecyclerView에 표시할 데이터 리스트 생성
        val itemList = mutableListOf<SecreteCharacterItem>()

        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        itemList.add(SecreteCharacterItem(R.drawable.item_tool1,R.drawable.secrete_tool2))
        /*itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필7"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필8"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필9"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필10"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필11"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필12"))*/


        // RecyclerView 어댑터 생성 및 데이터 리스트 전달
        val rvadapter = SecreteCharacterRVAdapter(itemList)

        // RecyclerView에 어댑터 설정(xml에서 설정한 리사이클러뷰 뷰바인딩)
        binding.secreteCharacterRv.adapter = rvadapter

        //RecyclerView 레이아웃 매니저 설정
        //여기서는 GridLayout, 2열로 설정
        //프래그먼트이기 때문에 this가 아닌 requireContext()
        binding.secreteCharacterRv.layoutManager = GridLayoutManager(requireContext(), 3)


    }

}