import org.gradle.api.JavaVersion

object Configurations {
    const val COMPILE_SDK = 34
    const val MIN_SDK = 24
    const val TARGET_SDK = 33
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val JVM_TARGET = "17"
    const val KOTLIN_COMPILER = "1.5.3"
    @JvmField val JAVA_VERSION = JavaVersion.VERSION_17
}