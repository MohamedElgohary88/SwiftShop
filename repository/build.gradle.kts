plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.repository"
    compileSdk = Configurations.COMPILE_SDK

    defaultConfig {
        minSdk = Configurations.MIN_SDK

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = Configurations.JVM_TARGET
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(project(Modules.DOMAIN_USE_CASE))

    implementation(ProjectDependencies.hilt)
    kapt(ProjectDependencies.hiltCompiler)
    implementation(ProjectDependencies.gsonConverter)

    implementation(ProjectDependencies.roomRuntime)
    implementation(ProjectDependencies.roomKtx)
    annotationProcessor(ProjectDependencies.roomCompiler)
    kapt(ProjectDependencies.roomCompiler)

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}