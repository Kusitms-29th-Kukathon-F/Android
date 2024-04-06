package com.example.kukathonproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kukathonproject.databinding.FragmentFirstBinding
import com.example.kukathonproject.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {

    lateinit var binding : FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(inflater,container,false)

        return binding.root
    }

}