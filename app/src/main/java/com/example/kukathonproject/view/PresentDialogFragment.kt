package com.example.kukathonproject.view

import android.content.Context
import android.graphics.Color
import android.graphics.Point
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import com.example.kukathonproject.R
import com.example.kukathonproject.databinding.FragmentCharacterDialogBinding
import com.example.kukathonproject.databinding.FragmentPresentDialogBinding
import com.example.kukathonproject.view.dopamin.ScoreFragment
import com.example.kukathonproject.view.mypage.MyPageFragment
import com.google.android.material.tabs.TabLayout

class PresentDialogFragment : DialogFragment() {

    lateinit var binding: FragmentPresentDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentPresentDialogBinding.inflate(inflater, container, false)


        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //dialog?.window?.setBackgroundDrawableResource(R.drawable.nameedit_box)
        dialog?.window?.setGravity(Gravity.CENTER)

        childFragmentManager.beginTransaction()
            .replace(R.id.tab_layout_container, HomeFragment().apply {})
            .commit()


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.closeIb.setOnClickListener {

            // 다이얼로그 종료
            dismiss()
        }
        setTabLayout()

    }

    private fun setTabLayout() {
        binding.verifyTablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        childFragmentManager.beginTransaction()
                            .replace(R.id.tab_layout_container, HomeFragment().apply {})
                            .commit()
                    }
                    1 -> {
                        childFragmentManager.beginTransaction()
                            .replace(R.id.tab_layout_container, MyPageFragment().apply {  })
                            .commit()
                    }
                    2->{
                        childFragmentManager.beginTransaction()
                            .replace(R.id.tab_layout_container, ScoreFragment().apply {  })
                            .commit()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    override fun onResume() {
        super.onResume()

        val windowManager = context?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)

        val params: ViewGroup.LayoutParams? = dialog?.window?.attributes
        val deviceHeight = size.y
        val deviceWidth = size . x

        // 다이얼로그의 높이를 디바이스 높이의 25%로 설정
        //params?.height = (deviceHeight * 0.25).toInt()
        //params?.width = (deviceWidth * 0.85).toInt()

        dialog?.window?.attributes = params as WindowManager.LayoutParams
    }

}