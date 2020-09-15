package com.divinkas.app.testuimodule.fragment.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.divinkas.app.testuimodule.viewmodel.BaseViewModel

class ContactViewModel: BaseViewModel() {
    var contactLiveData: LiveData<String> = MutableLiveData()

    fun loadSomething() {
    }
}