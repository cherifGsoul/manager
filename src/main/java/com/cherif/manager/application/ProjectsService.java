package com.cherif.manager.application;

import com.cherif.manager.domain.Project;
import com.cherif.manager.domain.Projects;
import com.cherif.manager.domain.Task;

import java.util.ArrayList;

public class ProjectsService {
    Projects projects;

    public ProjectsService(Projects projects) {
        this.projects = projects;
    }

    public String newProject(String name) {
        Project project = new Project(name);
        this.projects.add(project);
        return project.getId();
    }

    public void addTask(String projectId, String name) {
        Project project = this.projects.get(projectId);
        project.addTask(new Task(name));
    }

    public ArrayList<TaskView> listTasks(String projectId) {
        Project project = this.projects.get(projectId);
        ArrayList<Task> tasks = project.getTasks();
        ArrayList<TaskView > views = new ArrayList<>();
        tasks.forEach((Task task) -> {
            views.add(new TaskView(task.getName(), projectId));
        });
        return views;
    }

}
