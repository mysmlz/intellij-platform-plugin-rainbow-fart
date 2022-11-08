package com.gitee.muii.intellijplatformpluginrainbowfart.services

import com.intellij.openapi.project.Project
import com.gitee.muii.intellijplatformpluginrainbowfart.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
