plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.mvi_loginapp.feature.registerscreen.api"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(project(":core:navigation"))
    implementation(project(":feature:registerscreen:impl"))
    //TODO ,KZZZZZZZZZZZZZNM CircularReferenceException BECAUSE THIS MODULE DEPENDS ON :feature:loginscreen:api
    // AND :feature:loginscreen:api DEPENDS ON THIS MODULE
    implementation(project(":feature:loginscreen:api"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
}
