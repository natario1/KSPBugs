buildscript {
    repositories {
        mavenCentral()
        google()
        jcenter()
        mavenLocal()
    }

    configurations.configureEach {
        resolutionStrategy.cacheChangingModulesFor(10, TimeUnit.SECONDS)
    }

    dependencies {
        classpath("io.deepmedia.tools:publisher:0.6.0")
        classpath("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.5.21-1.0.0-beta07")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
        jcenter()
    }
}
