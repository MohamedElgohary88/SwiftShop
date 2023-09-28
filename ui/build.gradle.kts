plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.ui"
    compileSdk = 34

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = Configurations.JVM_TARGET
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Configurations.KOTLIN_COMPILER
    }
    buildFeatures {
        compose = true
    }
    kapt {
        correctErrorTypes = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(Modules.PRESENTATION_VIEW_MODEL))

    implementation(ProjectDependencies.constraintLayout)
    implementation(ProjectDependencies.composeCompiler)
    implementation(ProjectDependencies.activityCompose)
    implementation(ProjectDependencies.androidxCore)
    implementation(ProjectDependencies.composeBom)
    implementation(ProjectDependencies.composePreview)
    implementation(ProjectDependencies.composeUi)
    implementation(ProjectDependencies.composeRuntime)
    implementation(ProjectDependencies.composeUiGraphics)
    implementation(ProjectDependencies.composeMainfest)
    implementation(ProjectDependencies.composeMaterial3)
    implementation(ProjectDependencies.composeJunit)
    implementation(ProjectDependencies.composeUiTooling)
    implementation(ProjectDependencies.navigationCompose)
    implementation(ProjectDependencies.composeFoundation)
    implementation(ProjectDependencies.coroutines)
    implementation(ProjectDependencies.lifecycleRuntime)
    implementation(ProjectDependencies.lifecycleViewModel)
    implementation(ProjectDependencies.lifecycleLiveData)
    implementation(ProjectDependencies.hilt)
    implementation("androidx.appcompat:appcompat:1.6.1")
    kapt(ProjectDependencies.hiltCompiler)
    implementation(ProjectDependencies.coil)
    implementation(ProjectDependencies.hiltNavigation)
    implementation(ProjectDependencies.lottie)
    implementation(ProjectDependencies.splashScreen)
    implementation(ProjectDependencies.systemUiController)
    implementation(platform(ProjectDependencies.composeBom))
}