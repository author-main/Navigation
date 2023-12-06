plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    //id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.app.navigation"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

  /*  kapt {
        correctErrorTypes=true
    }

    hilt {
        enableAggregatingTask = true
    }*/
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val dagger_ver = "2.49"
    implementation ("com.google.dagger:dagger:$dagger_ver")
    implementation ("com.google.dagger:dagger-android:$dagger_ver")
    implementation ("com.google.dagger:dagger-android-support:$dagger_ver")
    kapt ("com.google.dagger:dagger-compiler:$dagger_ver")
    kapt ("com.google.dagger:dagger-android-processor:$dagger_ver")

    /*implementation ("com.google.dagger:hilt-android:2.49")
    kapt ("com.google.dagger:hilt-compiler:2.49")*/

}