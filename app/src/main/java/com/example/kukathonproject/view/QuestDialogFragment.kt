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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kukathonproject.R
import com.example.kukathonproject.databinding.FragmentPresentDialogBinding
import com.example.kukathonproject.databinding.FragmentQuestDialogBinding
import com.example.kukathonproject.model.QuestItem
import com.example.kukathonproject.model.SecreteCharacterItem

class QuestDialogFragment : DialogFragment() {

    lateinit var binding: FragmentQuestDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentQuestDialogBinding.inflate(inflater, container, false)


        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //dialog?.window?.setBackgroundDrawableResource(R.drawable.nameedit_box)
        dialog?.window?.setGravity(Gravity.CENTER)

        initRecycler()


        return binding.root
    }

    private fun initRecycler(){

        // RecyclerView에 표시할 데이터 리스트 생성
        val itemList = mutableListOf<QuestItem>()

        itemList.add(QuestItem("인스타그램 사용시간을 18분 단축시켜보세요."))
        itemList.add(QuestItem("어제보다 휴대폰을 30분 덜 사용하셨네요!"))
        itemList.add(QuestItem("새로운 아이템을 획득했어요!"))
        itemList.add(QuestItem("휴대폰 사용시간을 30분 단축시켜보세요."))
        /*itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필7"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필8"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필9"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필10"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필11"))
        itemList.add(ProfileData(R.drawable.profilestorage_profile, "프로필12"))*/



        // RecyclerView 어댑터 생성 및 데이터 리스트, 리스너 전달
        val rvadapter = QuestRVAdapter(itemList)

        // RecyclerView에 어댑터 설정(xml에서 설정한 리사이클러뷰 뷰바인딩)
        binding.questRv.adapter = rvadapter

        //RecyclerView 레이아웃 매니저 설정
        //여기서는 GridLayout, 2열로 설정
        //프래그먼트이기 때문에 this가 아닌 requireContext()
        binding.questRv.layoutManager =  LinearLayoutManager(requireContext())


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