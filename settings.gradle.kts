pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://plugins.gradle.org/m2/")
        maven("https://developer.huawei.com/repo/")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://plugins.gradle.org/m2/")
        maven("https://developer.huawei.com/repo/")
    }
}
rootProject.name = "BaseArch"
include(
    ":app",
    ":domain",
    ":data:model",
    ":data:local",
    ":data:remote",
    ":data:repository",
    ":common:provider",
    ":common:component",
    ":common:theme",
    ":libraries:framework",
    ":libraries:jetframework",
    ":libraries:testutils",
    ":features:characters",
    ":features:episodes",
    ":features:locations",
    ":features:splash",
    ":features:welcome",
    ":features:settings",
    ":features:home",
    ":features:maps",
)