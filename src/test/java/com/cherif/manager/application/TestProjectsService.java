package com.cherif.manager.application;

import com.cherif.manager.infrastructure.persistence.fake.FakeProjects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class TestProjectsService {
    ProjectsService projectsService;

    @BeforeEach
    public void makeService() {
        this.projectsService = new ProjectsService(new FakeProjects());
    }

    @Test
    public void should_add_tasks_to_a_project() {
        String projectId = this.projectsService.newProject("Micro testing");
        this.projectsService.addTask(projectId, "TDD in Java");
        ArrayList<TaskView> actual = this.projectsService.listTasks(projectId);
        ArrayList<TaskView> expected = new ArrayList<>();
        expected.add(new TaskView("TDD in Java", projectId));
        assertTrue(actual.get(0).equals(expected.get(0)));
    }
}
