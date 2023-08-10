package com.jeri.portfolio.services;

import com.jeri.portfolio.dtos.ProjectDto;
import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<ProjectDto> getAllProjects();
    ProjectDto getProjectById(Long id);
    ProjectDto createProject(ProjectDto projectDto);
    ProjectDto updateProject(Long id, ProjectDto projectDto);
    void deleteProject(Long id);
}
