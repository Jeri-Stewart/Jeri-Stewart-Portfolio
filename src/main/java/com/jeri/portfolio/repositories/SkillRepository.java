package com.jeri.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jeri.portfolio.entities.Skill;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
