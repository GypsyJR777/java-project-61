plugins {
    application
    checkstyle
    id("org.sonarqube") version "7.1.0.6387"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

apply(plugin = "com.github.ben-manes.versions")

buildscript {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }

    dependencies {
        classpath("com.github.ben-manes:gradle-versions-plugin:0.53.0")
    }
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "GypsyJR777_java-project-61")
        property("sonar.organization", "gypsyjr777")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}