package com.github.chisui.intellijconfig.services

import com.intellij.openapi.project.Project
import com.github.chisui.intellijconfig.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
