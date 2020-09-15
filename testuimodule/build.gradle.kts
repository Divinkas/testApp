plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        minSdkVersion(Configuration.minSdkVersion)
        targetSdkVersion(Configuration.targetSdkVersion)
        versionCode = 1
        versionName = "1.0.0"
    }

    dataBinding.isEnabled = true

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Dependencies.kotlinStandardLibrary)

    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.coreExtensions)
    implementation(Dependencies.AndroidX.multiDex)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.AndroidX.navigationFragment)
    implementation(Dependencies.AndroidX.navigationUi)
    implementation(Dependencies.AndroidX.lifecycleExtensions)
    implementation(Dependencies.AndroidX.viewModel)
    implementation(Dependencies.AndroidX.encryptedSharedPreferences)

    implementation(Dependencies.Koin.core)
    implementation(Dependencies.Koin.coreExt)
    implementation(Dependencies.Koin.scope)
    implementation(Dependencies.Koin.viewModel)
    implementation(Dependencies.Koin.ext)

    implementation(Dependencies.Misc.timber)

    testImplementation(Dependencies.jUnit)
    testImplementation(Dependencies.Koin.test)
}
