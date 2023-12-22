import extensions.*

plugins {
    id("commons.android-feature")
    id("commons.android-compose")
    id("com.google.devtools.ksp")
}

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "maps")
}


dependencies {
    JETFRAMEWORK
    FRAMEWORK
    MODEL
    DOMAIN
    PROVIDER
    THEME
    COMPONENT

    addNavigationDependencies()

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    implementation(DaggerHiltLib.Compose)
}