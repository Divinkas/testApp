package com.divinkas.app.testuimodule

import com.divinkas.app.testuimodule.installer.KoinInstaller

class UIBuilderAPI() {

    companion object {
        private var instance: UIBuilderAPI? = null

        fun get(): UIBuilderAPI = instance
                ?: throw IllegalStateException("UIBuilderAPI is not instantiated")
    }

    init {
        KoinInstaller.install()
    }
}