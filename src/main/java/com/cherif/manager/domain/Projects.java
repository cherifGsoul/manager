package com.cherif.manager.domain;

public interface Projects {
    Project get(String projectId);

    void add(Project project);
}
