package com.divinkas.app.newandroidproject

import android.app.Application
import com.divinkas.app.newandroidproject.base.KotlinInstaller
import com.divinkas.app.testuimodule.UIBuilderAPI

class TestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        KotlinInstaller.install(this)
        UIBuilderAPI()
    }
}