package com.github.tom025.c4intellijplugin.services

import com.github.tom025.c4intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
