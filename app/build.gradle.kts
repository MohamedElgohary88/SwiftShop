plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.swiftshop"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.swiftshop"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = Configurations.JAVA_VERSION
        targetCompatibility = Configurations.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Configurations.JVM_TARGET
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(Modules.REPO))
    implementation(project(Modules.DATA_REMOTE))
    implementation(project(Modules.DATA_LOCAL))
    implementation(project(Modules.DOMAIN_USE_CASE))
    implementation(project(Modules.PRESENTATION_UI))
    implementation(project(Modules.PRESENTATION_VIEW_MODEL))

    implementation(ProjectDependencies.retrofit)
    implementation(ProjectDependencies.gsonConverter)

    implementation(ProjectDependencies.logging)

    implementation(ProjectDependencies.hilt)
    implementation(ProjectDependencies.composeMaterial3)

    kapt(ProjectDependencies.hiltCompiler)

    implementation(ProjectDependencies.encryptedSharedPreference)

    implementation(ProjectDependencies.roomRuntime)
    kapt(ProjectDependencies.roomCompiler)
    implementation(ProjectDependencies.dataStore)

}

kapt {
    correctErrorTypes = true
}