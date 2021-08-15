plugins {
    id("kotlin-multiplatform")
    id("com.google.devtools.ksp")

}

kotlin {
    androidNativeX64()
}

dependencies {
    ksp(project(":processor"))
}