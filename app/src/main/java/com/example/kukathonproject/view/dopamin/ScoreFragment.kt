package com.example.kukathonproject.view.dopamin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.kukathonproject.R
import com.example.kukathonproject.base.BaseFragment
import com.example.kukathonproject.databinding.FragmentScoreBinding
import com.google.android.material.tabs.TabLayout

class ScoreFragment: BaseFragment<FragmentScoreBinding>(FragmentScoreBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFragment(ChangeFragment())
        binding.tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position) {
                    0 -> {
                        val firstFragment = ChangeFragment()
                        showFragment(firstFragment)
                    }
                    1 -> {
                        val secondFragment = UsingFragment()
                        showFragment(secondFragment)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun showFragment(fragment: Fragment){
        childFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

}