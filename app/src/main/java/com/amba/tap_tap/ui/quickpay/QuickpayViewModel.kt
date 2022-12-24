package com.amba.tap_tap.ui.quickpay

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuickpayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Quick pay Fragment"
    }
    val text: LiveData<String> = _text
}