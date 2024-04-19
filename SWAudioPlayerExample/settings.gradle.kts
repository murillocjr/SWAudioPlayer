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

rootProject.name = "SWAudioPlayerExample"
include(":app")

includeBuild("../swaudioplayer") {
    dependencySubstitution {
        substitute(module("com.stonewall:swaudioplayer"))
    }
}