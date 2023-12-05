plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.app.navigation"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.app.navigation"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    kapt {
        correctErrorTypes=true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //implementation(project(":feature:cart"))
    implementation(project(mapOf("path" to ":navigation")))
    implementation(project(mapOf("path" to ":features:signin")))
    implementation(project(mapOf("path" to ":features:signup")))
    implementation(project(mapOf("path" to ":features:catalog")))
    implementation(project(mapOf("path" to ":features:cart")))
    implementation(project(mapOf("path" to ":features:profile")))

    val dagger_ver = "2.49"
    implementation ("com.google.dagger:dagger:$dagger_ver")
    implementation ("com.google.dagger:dagger-android:$dagger_ver")
    implementation ("com.google.dagger:dagger-android-support:$dagger_ver")
    kapt ("com.google.dagger:dagger-compiler:$dagger_ver")
    kapt ("com.google.dagger:dagger-android-processor:$dagger_ver")

    implementation ("com.google.dagger:hilt-android:2.49")
    kapt ("com.google.dagger:hilt-compiler:2.49")
}