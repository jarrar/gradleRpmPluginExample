package org.packaging.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


class RpmPackagePlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('RpmExtension', RpmExtension)
        project.task('hello') {
            doLast {
                println ">>>> ${extension.message} ${extension.greeter}"
            }
        }
    }
}
