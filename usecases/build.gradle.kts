plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    kotlin("kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    api(project(Modules.ENTITIES_MODEL))
    implementation(ProjectDependencies.dagger)
    implementation(ProjectDependencies.coroutines)
}