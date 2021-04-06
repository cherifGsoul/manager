package com.cherif.manager.application;

import java.util.Objects;

public class TaskView extends Object{
    private String name;
    private String projectId;

    public TaskView(String name, String projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskView taskView = (TaskView) o;
        return Objects.equals(name, taskView.name) && Objects.equals(projectId, taskView.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, projectId);
    }
}
