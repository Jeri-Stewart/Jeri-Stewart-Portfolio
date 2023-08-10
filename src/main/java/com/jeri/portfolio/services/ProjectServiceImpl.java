package com.jeri.portfolio.services;

import com.jeri.portfolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeri.portfolio.dtos.ProjectDto;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Override
    public List<ProjectDto> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
                .map(ProjectDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public ProjectDto getProjectById(Long id) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        if (projectOptional.isPresent()) {
            return new ProjectDto(projectOptional.get());
        } else {
            throw new EntityNotFoundException("Project not found with id: " + id);
        }
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        Project project = new Project();
        // Map fields from projectDto to project
        Project savedProject = projectRepository.save(project);
        return new ProjectDto(savedProject);
    }

    @Override
    public ProjectDto updateProject(Long id, ProjectDto projectDto) {
        Optional<Project> projectOptional = projectRepository.findById(id);
        if (projectOptional.isPresent()) {
            Project project = projectOptional.get();
            // Update project fields based on projectDto
            Project updatedProject = projectRepository.save(project);
            return new ProjectDto(updatedProject);
        } else {
            throw new EntityNotFoundException("Project not found with id: " + id);
        }
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

}
