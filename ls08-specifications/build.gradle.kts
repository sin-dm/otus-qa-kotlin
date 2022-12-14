import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"

}

group = "ru.sindm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.18")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.18")
    testImplementation("io.kotest:kotest-runner-junit5:5.4.0")
    testImplementation("io.kotest:kotest-assertions-core:5.4.0")
    testImplementation("io.kotest:kotest-framework-datatest:5.4.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform {
//        includeEngines = setOf("spek2")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}