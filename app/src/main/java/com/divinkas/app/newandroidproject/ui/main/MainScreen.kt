package com.divinkas.app.newandroidproject.ui.main

import androidx.navigation.fragment.findNavController
import com.divinkas.app.newandroidproject.R
import com.divinkas.app.testuimodule.fragment.BaseScreen
import kotlinx.android.synthetic.main.main_screen.*

class MainScreen : BaseScreen(R.layout.main_screen) {
    override fun setupUi() {
        btnGoToDefaultContactScreen.setOnClickListener {
            findNavController().navigate(MainScreenDirections.toDefaultContactScreen())
        }

        btnGoToOverridedContactScreen.setOnClickListener {
            findNavController().navigate(MainScreenDirections.toOverridedContactScreen())
        }
    }
}