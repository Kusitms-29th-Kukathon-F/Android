package com.example.kukathonproject.view.dopamin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kukathonproject.R
import com.example.kukathonproject.base.BaseFragment
import com.example.kukathonproject.databinding.FragmentUsingBinding
import com.example.kukathonproject.model.usingItem

class UsingFragment : BaseFragment<FragmentUsingBinding>(FragmentUsingBinding::inflate) {
    private lateinit var adapter:ScoreAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemList = listOf(
            usingItem(R.drawable.youtube, "Youtube", R.drawable.youtube_time, "6시간 30분"),
            usingItem(R.drawable.instagram, "Youtube", R.drawable.instagram_score, "5시간 20분"),
            usingItem(R.drawable.netflix, "Youtube", R.drawable.netflix_score, "3시간 10분"),
            usingItem(R.drawable.tiktok, "Youtube", R.drawable.tiktok_score, "1시간 10분"),
            usingItem(R.drawable.twitch, "Youtube", R.drawable.twitch_score, "30분"),
            usingItem(R.drawable.bereal, "Youtube", R.drawable.bereal_score, "10분")
        )

        val recyclerview = binding.recycler
        adapter = ScoreAdapter(itemList)
        recyclerview.adapter = adapter

    }
}