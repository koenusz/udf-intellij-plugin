package com.github.koenusz.udfintellijplugin.services

import com.github.koenusz.udfintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
