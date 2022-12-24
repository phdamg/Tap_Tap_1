package com.amba.tap_tap.ui.naira

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NairaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Naira Fragment"
    }
    val text: LiveData<String> = _text
}