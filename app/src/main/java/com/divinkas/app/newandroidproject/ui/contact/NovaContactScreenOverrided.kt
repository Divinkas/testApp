package com.divinkas.app.newandroidproject.ui.contact

import com.divinkas.app.newandroidproject.R
import com.divinkas.app.testuimodule.fragment.contact.ContactScreen

class NovaContactScreenOverrided : ContactScreen() {
    override fun setupUi() {
        setContactText(R.string.app_name)
        setContactTextStyle(R.style.CustomContactText)

        contactViewModel.loadSomething()
    }
}