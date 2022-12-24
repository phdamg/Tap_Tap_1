package com.amba.tap_tap.ui.chat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.amba.tap_tap.User

class ChatViewModel : ViewModel() {



    private val _text = MutableLiveData<String>().apply {
        value = "This is Chat Fragment"

    }
    val text: LiveData<String> = _text
}


/*val userList = MutableLiveData<List<User>>()

init {


    userList.value = "Data" */

