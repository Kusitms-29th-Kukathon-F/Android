package com.example.kukathonproject.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kukathonproject.network.Apis
import com.example.kukathonproject.network.RetrofitInstance

class HomeViewModel: ViewModel() {
    val service = RetrofitInstance.retrofitInstance().create(Apis::class.java)


}