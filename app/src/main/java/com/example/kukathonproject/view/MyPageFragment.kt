package com.example.kukathonproject.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kukathonproject.base.BaseFragment
import com.example.kukathonproject.databinding.FragmentHomeBinding
import com.example.kukathonproject.databinding.FragmentMyPageBinding

class MyPageFragment: BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1Btn.setOnClickListener {
            val characterDialog = CharacterDialogFragment()
            characterDialog.show(childFragmentManager, characterDialog.tag)
        }

    }
}