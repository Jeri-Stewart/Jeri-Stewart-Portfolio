package com.jeri.portfolio.dtos;

import com.jeri.portfolio.entities.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto implements Serializable {

    private Long id;
    private String title;
    private String description;
    private String technologiesUsed;
    private String githubLink;
    private String demoLink;
    private String imageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProjectDto(Project project) {
        this.id = project.getId();
        this.title = project.getTitle();
        this.description = project.getDescription();

        if (project.getTechnologiesUsed() != null) {
            this.technologiesUsed = project.getTechnologiesUsed();
        }

        if (project.getGithubLink() != null) {
            this.githubLink = project.getGithubLink();
        }

        if (project.getDemoLink() != null) {
            this.demoLink = project.getDemoLink();
        }

        if (project.getImageUrl() != null) {
            this.imageUrl = project.getImageUrl();
        }
        this.createdAt = project.getCreatedAt();
        this.updatedAt = project.getUpdatedAt();
    }
}
