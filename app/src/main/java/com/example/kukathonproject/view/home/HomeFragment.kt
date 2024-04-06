package com.example.kukathonproject.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kukathonproject.R
import com.example.kukathonproject.base.BaseFragment
import com.example.kukathonproject.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sunmulBtn.setOnClickListener{
            PresentDialogFragment().show(childFragmentManager, PresentDialogFragment().tag)
        }
        binding.moveBtn.setOnClickListener{
            CharacterDialogFragment().show(childFragmentManager, CharacterDialogFragment().tag)
        }

    }
}