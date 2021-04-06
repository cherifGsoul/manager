package com.cherif.manager.domain;

import java.util.ArrayList;

public class Project {
    private String id;
    private String name;
    private ArrayList<Task> tasks = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    public void setId(String id) {
        this.id = id;
    }
}
