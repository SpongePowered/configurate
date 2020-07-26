import org.spongepowered.configurate.build.Versions
import org.spongepowered.configurate.build.core

plugins {
    id("org.spongepowered.configurate-component")
}

dependencies {
    api(core())
    implementation("com.typesafe:config:${Versions.HOCON}")
    testImplementation("com.google.guava:guava:29.0-jre")
}
