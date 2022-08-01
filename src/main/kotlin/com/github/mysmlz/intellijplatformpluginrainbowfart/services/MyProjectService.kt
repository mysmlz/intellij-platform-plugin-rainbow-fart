package com.github.mysmlz.intellijplatformpluginrainbowfart.services

import com.intellij.openapi.project.Project
import com.github.mysmlz.intellijplatformpluginrainbowfart.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
