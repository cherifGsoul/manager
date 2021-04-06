package com.cherif.manager.infrastructure.persistence.fake;

import com.cherif.manager.domain.Project;
import com.cherif.manager.domain.Projects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFakeProjects {
    Projects projects = new FakeProjects();

    @Test
    public void should_identify_a_project() {
        Project project = new Project("Project management app");
        projects.add(project);
        assertNotNull(project.getId());
    }

    @Test
    public void should_get_save_project() {
        Project project = new Project("Project management app");
        projects.add(project);
        Project persisted = projects.get(project.getId());
        assertEquals(project, persisted);
    }
}
