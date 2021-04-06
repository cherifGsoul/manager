package com.cherif.manager.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestProject {
    Project project;

    @BeforeEach
    public void makeProject() {
        project = new Project("Project management App");
    }

    @Test
    public void should_have_default_null_identity() {
        assertNull(project.getId());
    }

    @Test
    public void should_list_tasks() {
        Task task = new Task("Write tests before code");
        project.addTask(task);
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(task);
        assertTrue(tasks.equals(project.getTasks()));
    }
}
