plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "com.stonewall"

android {
    namespace = "com.stonewall.swaudioplayer"
    compileSdk = 34

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    mavenCentral()
    google()
}

dependencies {
}