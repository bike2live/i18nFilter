package com.github.bike2live.i18nfilter.services

import com.intellij.openapi.project.Project
import com.github.bike2live.i18nfilter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
