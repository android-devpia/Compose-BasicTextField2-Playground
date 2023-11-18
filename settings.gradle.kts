pluginManagement {
    repositories {
        google()
        mavenCentral()
//        maven { url = uri("https://androidx.dev/snapshots/builds/10854681/artifacts/repository") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
//        maven { url = uri("https://androidx.dev/snapshots/builds/10854681/artifacts/repository") }
    }
}

rootProject.name = "Compose-BasicTextField2-Playground"
include(":app")
