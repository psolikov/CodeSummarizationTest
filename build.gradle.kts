plugins {
    application
    kotlin("jvm") version "1.3.72"
}

group = "ru.hse.spb.solikov"
version = "1.0-SNAPSHOT"


application {
    mainClassName = "ru.hse.spb.solikov.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.eclipse.jgit:org.eclipse.jgit:5.9.0.202009080501-r")
    testImplementation("junit", "junit", "4.12")
}