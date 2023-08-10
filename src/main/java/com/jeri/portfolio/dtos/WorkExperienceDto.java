package com.jeri.portfolio.dtos;

import com.jeri.portfolio.entities.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceDto implements Serializable {

    private Long id;
    private String title;
    private String company;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkExperienceDto(WorkExperience workExperience) {
        this.id = workExperience.getId();
        this.title = workExperience.getTitle();
        this.company = workExperience.getCompany();

        if (workExperience.getLocation() != null) {
            this.location = workExperience.getLocation();
        }

        if (workExperience.getStartDate() != null) {
            this.startDate = workExperience.getStartDate();
        }

        if (workExperience.getEndDate() != null) {
            this.endDate = workExperience.getEndDate();
        }

        if (workExperience.getDescription() != null) {
            this.description = workExperience.getDescription();
        }

        this.createdAt = workExperience.getCreatedAt();
        this.updatedAt = workExperience.getUpdatedAt();
    }
}
