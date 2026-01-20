plugins {
    kotlin("jvm") version "1.9.22"
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

javafx {
    version = "21"
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
}

application {
    mainClass.set("app.MainAppKt")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
