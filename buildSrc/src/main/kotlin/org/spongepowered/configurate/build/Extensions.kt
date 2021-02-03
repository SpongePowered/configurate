package org.spongepowered.configurate.build

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.tasks.javadoc.Javadoc
import org.gradle.external.javadoc.StandardJavadocDocletOptions

/**
 * Create a dependency on a specific component in this project
 */
fun DependencyHandler.format(component: String): Dependency {
    return project(mapOf("path" to ":format:$component"))
}

fun DependencyHandler.core(): Dependency {
    return project(mapOf("path" to ":core"))
}

fun Javadoc.applyCommonAttributes() {
    val options = this.options
    options.encoding = "UTF-8"
    if (options is StandardJavadocDocletOptions) {
        options.links(
            "https://lightbend.github.io/config/latest/api/",
            "https://fasterxml.github.io/jackson-core/javadoc/2.10/",
            "https://checkerframework.org/api/",
            "https://www.javadoc.io/doc/io.leangen.geantyref/geantyref/1.3.11/"
        )

        options.addBooleanOption("html5", true)
        options.addStringOption("-release", "8")
        options.linkSource()
    }
}
