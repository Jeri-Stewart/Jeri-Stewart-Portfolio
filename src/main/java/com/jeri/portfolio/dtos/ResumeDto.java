package com.jeri.portfolio.dtos;

import com.jeri.portfolio.entities.Resume;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto implements Serializable {

    private Long id;
    private String filePath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ResumeDto(Resume resume) {
        this.id = resume.getId();

        if (resume.getFilePath() != null) {
            this.filePath = resume.getFilePath();
        }

        this.createdAt = resume.getCreatedAt();
        this.updatedAt = resume.getUpdatedAt();
    }
}
