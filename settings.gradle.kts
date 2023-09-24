pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "SwiftShop"

include(":app")
include(":ui")
include(":remote")
include(":local")
include(":repository")
include(":viewmodels")
include(":usecases")
include(":entities")