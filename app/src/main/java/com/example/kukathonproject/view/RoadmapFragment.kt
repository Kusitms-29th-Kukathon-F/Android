package com.example.kukathonproject.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kukathonproject.databinding.FragmentRoadmapBinding

class RoadmapFragment: Fragment() {


    lateinit var binding : FragmentRoadmapBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentRoadmapBinding.inflate(inflater,container,false)

        return binding.root
    }

}