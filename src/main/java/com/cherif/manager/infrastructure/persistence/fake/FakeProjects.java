package com.cherif.manager.infrastructure.persistence.fake;

import com.cherif.manager.domain.Project;
import com.cherif.manager.domain.Projects;

import java.util.HashMap;

public class FakeProjects implements Projects {
    HashMap<String, Project> projects = new HashMap<>();

    @Override
    public Project get(String projectId) {
        return projects.get(projectId);
    }

    @Override
    public void add(Project project) {
        String key = String.valueOf(projects.size());
        project.setId(key);
        projects.put(key, project);
    }
}
