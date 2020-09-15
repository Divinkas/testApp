package com.divinkas.app.newandroidproject.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

object KotlinInstaller {
    private val appModule = module {
    }

    private val viewModelModule = module {
    }

    fun install(application: Application) {
        startKoin {
            androidLogger()
            androidContext(application)
            modules(appModule)
            modules(viewModelModule)
        }
    }
}