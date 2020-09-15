package com.divinkas.app.testuimodule.installer

import com.divinkas.app.testuimodule.components.BaseCoroutineComponent
import com.divinkas.app.testuimodule.components.CoroutineComponent
import com.divinkas.app.testuimodule.fragment.contact.ContactViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.koinApplication
import org.koin.dsl.module

object KoinInstaller {
    private val appModule = module {
        factory<CoroutineComponent> { BaseCoroutineComponent() }
    }

    private val viewModelModule = module {
        viewModel { ContactViewModel() }
    }

    fun install() {
        koinApplication {
            loadKoinModules(listOf(appModule, viewModelModule))
        }
    }
}