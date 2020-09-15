package com.divinkas.app.testuimodule.fragment.contact

import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import com.divinkas.app.testuimodule.R
import com.divinkas.app.testuimodule.fragment.BaseScreen
import kotlinx.android.synthetic.main.contact_screen.*
import org.koin.androidx.viewmodel.ext.android.viewModel

open class ContactScreen(@LayoutRes layout: Int = R.layout.contact_screen) : BaseScreen(layout) {
    protected val contactViewModel: ContactViewModel by viewModel()

    open fun setContactText(@StringRes text: Int) {
        text_contact?.setText(text)
    }

    open fun setContactTextStyle(@StyleRes style: Int) {
        text_contact?.setTextAppearance(style)
    }
}