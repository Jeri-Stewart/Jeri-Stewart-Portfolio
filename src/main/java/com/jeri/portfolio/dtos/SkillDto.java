package com.jeri.portfolio.dtos;

import com.jeri.portfolio.entities.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillDto implements Serializable {

    private Long id;
    private String name;
    private String category;
    private String proficiency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SkillDto(Skill skill) {
        this.id = skill.getId();
        this.name = skill.getName();

        if (skill.getCategory() != null) {
            this.category = skill.getCategory();
        }

        if (skill.getProficiency() != null) {
            this.proficiency = skill.getProficiency();
        }

        this.createdAt = skill.getCreatedAt();
        this.updatedAt = skill.getUpdatedAt();
    }
}

