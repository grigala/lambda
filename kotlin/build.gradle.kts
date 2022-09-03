import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0"
    kotlin("kapt") version "1.7.0"
}

group = "io.github.grigala"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
val arrowVersion = "1.1.2"

dependencies {
    implementation("io.arrow-kt:arrow-core-jvm:$arrowVersion")
    implementation("io.arrow-kt:arrow-optics:$arrowVersion")
    implementation("io.arrow-kt:arrow-fx-coroutines:$arrowVersion")
    implementation("io.arrow-kt:arrow-core-data:0.12.1")
    implementation("io.arrow-kt:arrow-fx:0.12.1")
    implementation("io.arrow-kt:arrow-mtl:0.11.0")
    implementation("io.arrow-kt:arrow-syntax:0.12.1")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.5")
    implementation("io.github.microutils:kotlin-logging:2.1.23")
    implementation("org.awaitility:awaitility:4.2.0")

    testImplementation(kotlin("test"))
    kapt("io.arrow-kt:arrow-meta:1.6.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
