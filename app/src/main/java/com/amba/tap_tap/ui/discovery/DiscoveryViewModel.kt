package com.amba.tap_tap.ui.discovery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiscoveryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Discovery Fragment"
    }
    val text: LiveData<String> = _text
}