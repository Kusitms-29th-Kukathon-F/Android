package com.example.kukathonproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kukathonproject.databinding.FragmentSecondBinding
import com.example.kukathonproject.databinding.FragmentThirdBinding

class ThirdFragment: Fragment() {


    lateinit var binding : FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentThirdBinding.inflate(inflater,container,false)

        return binding.root
    }

}