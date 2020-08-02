plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(AndroidConfig.compileSdkVersion)
    kotlinOptions {
        jvmTarget = "1.8"
    }

    viewBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":inject"))
    implementation(project(":ui"))
    implementation(Deps.Androidx.material)
    implementation(Deps.Androidx.fragment)
    implementation(Deps.Kotlin.coroutines)
    implementation(Deps.Kotlin.coroutinesAndroid)
    implementation(Deps.Androidx.constraintlayout)
    implementation(Deps.Google.dagger)
    kapt(Deps.Google.daggerCompiler)
}