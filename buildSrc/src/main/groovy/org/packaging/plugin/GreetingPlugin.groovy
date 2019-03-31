package org.packaging.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('greetingData', GreetingPluginExtension)
        project.task('hello') {
            doLast {
                println ">>>> ${extension.message} from ${extension.greeter}"
            }
        }
    }
}
