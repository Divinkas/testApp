package com.divinkas.app.testuimodule.viewmodel

import androidx.lifecycle.ViewModel
import com.divinkas.app.testuimodule.components.CoroutineComponent
import org.koin.core.KoinComponent
import org.koin.core.inject

open class BaseViewModel : ViewModel(), KoinComponent {
    protected val coroutineComponent: CoroutineComponent by inject()
}