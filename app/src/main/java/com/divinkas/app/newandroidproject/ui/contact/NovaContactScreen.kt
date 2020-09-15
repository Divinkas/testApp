package com.divinkas.app.newandroidproject.ui.contact

import com.divinkas.app.testuimodule.fragment.contact.ContactScreen

class NovaContactScreen: ContactScreen() {
    override fun setupUi() {
        contactViewModel.loadSomething()
    }
}