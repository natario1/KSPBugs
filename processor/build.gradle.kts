plugins {
    kotlin("jvm")
    id("io.deepmedia.tools.publisher")
}

dependencies {
    api("com.google.devtools.ksp:symbol-processing-api:1.5.21-1.0.0-beta07")
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}

publisher {
    project.name = "Sample KSP Processor"
    project.description = "Sample KSP Processor"
    project.artifact = "processor"
    project.group = "io.deepmedia.tools.testing"
    release.version = "0.1.0"
    release.sources = io.deepmedia.tools.publisher.common.Release.SOURCES_AUTO
    directory()
}