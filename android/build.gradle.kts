group = "com.paymob.flutter.flutter_paymob_sdk"
version = "1.0.0"

buildscript {
    val kotlinVersion = "2.1.0"
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://raw.githubusercontent.com/motazyusuf/paymob-android-repo/main/") }
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.7.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "com.paymob.flutter"
    compileSdk = 35

    defaultConfig {
        minSdk = 23
        consumerProguardFiles("consumer-proguard-rules.pro")
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    api("com.paymob.sdk:Paymob-SDK:1.6.9")
}
