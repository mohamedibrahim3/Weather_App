plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mada.weatherapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.mada.weatherapp"
        minSdk = 21
        //Replace from 34 to 35
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.runner.v152)
    val androidXTestCoreVersion = ("1.4.0")
    val androidXTestExtKotlinRunnerVersion = ("1.1.3")
    val archTestingVersion = ("2.1.0")
    val coroutinesVersion = ("1.5.0")
    val espressoVersion = ("3.4.0")
    val hamcrestVersion = ("1.3")
    val junitVersion = ("4.13.2")
    val robolectricVersion = ("4.5.1")

    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1110)
    implementation(libs.androidx.constraintlayout.v214)
    implementation(libs.androidx.legacy.support.v4)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)


    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    //GSON
    implementation(libs.gson)

    //Coroutines Dependencies
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    //Room
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime)
//    kapt(libs.androidx.room.compiler)

    //ViewModel & livedata
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.fragment.ktx)

    //glide
    implementation(libs.glide)

    //Location
    implementation(libs.play.services.location)
    implementation(libs.play.services.maps)

    //Navigation
    implementation("androidx.navigation:navigation-fragment:2.8.4")
    implementation("androidx.navigation:navigation-ui:2.8.4")

    //Swipe decorator
    implementation("it.xabaras.android:recyclerview-swipedecorator:1.4")

    //lottie
    implementation("com.airbnb.android:lottie:6.2.0")

    //splash
    implementation("androidx.core:core-splashscreen:1.0.1")

    //Data store preferences
    implementation("androidx.datastore:datastore-preferences-core:1.1.1")
    implementation ("androidx.datastore:datastore-preferences:1.1.1")

    //Worker
    implementation ("androidx.work:work-runtime:2.10.0")
    implementation ("androidx.work:work-runtime-ktx:2.10.0")



    //testing dependencies


    // AndroidX and Robolectric
    testImplementation("androidx.test.ext:junit-ktx:$androidXTestExtKotlinRunnerVersion")
    testImplementation("androidx.test:core-ktx:$androidXTestCoreVersion")
    testImplementation("org.robolectric:robolectric:4.8")

    // InstantTaskExecutorRule
    testImplementation("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation("androidx.arch.core:core-testing:2.2.0")

    // kotlinx-coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")

    // hamcrest
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("org.hamcrest:hamcrest-library:2.2")
    androidTestImplementation("org.hamcrest:hamcrest:2.2")
    androidTestImplementation("org.hamcrest:hamcrest-library:2.2")

    // Dependencies for local unit tests
    testImplementation("junit:junit:$junitVersion")
    testImplementation("org.hamcrest:hamcrest-all:$hamcrestVersion")
    testImplementation("androidx.arch.core:core-testing:$archTestingVersion")
    testImplementation("org.robolectric:robolectric:$robolectricVersion")

    // AndroidX Test - JVM testing
    testImplementation("androidx.test:core-ktx:$androidXTestCoreVersion")
    testImplementation("androidx.test.ext:junit:$androidXTestExtKotlinRunnerVersion")

    // AndroidX Test - Instrumented testing
    androidTestImplementation("androidx.test.ext:junit:$androidXTestExtKotlinRunnerVersion")
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
    androidTestImplementation("androidx.arch.core:core-testing:$archTestingVersion")

}