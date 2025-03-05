package com.example.tabsdemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.map

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    private var type = _index.value;
    val text: LiveData<String> = _index.map {
        "На этой странице отображаются $it"
    }


    fun setIndex(index: Int) {
        _index.value = index
    }
}