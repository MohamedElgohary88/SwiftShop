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
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(project(Modules.PRESENTATION_VIEW_MODEL))

    implementation(ProjectDependencies.constraintLayout)
    implementation(ProjectDependencies.activityCompose)
    implementation(ProjectDependencies.composeBom)
    implementation(ProjectDependencies.composeUi)
    implementation(ProjectDependencies.composeRuntime)
    implementation(ProjectDependencies.composeUiGraphics)
    implementation(ProjectDependencies.composeUiPreviewTool)
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
    kapt(ProjectDependencies.hiltCompiler)
    implementation(ProjectDependencies.coil)
    implementation(ProjectDependencies.hiltNavigation)
    implementation(ProjectDependencies.lottie)
    implementation(ProjectDependencies.splashScreen)
    implementation(ProjectDependencies.systemUiController)
}