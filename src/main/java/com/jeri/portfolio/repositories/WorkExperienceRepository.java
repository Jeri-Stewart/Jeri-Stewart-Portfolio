package com.jeri.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jeri.portfolio.entities.WorkExperience;

@Repository
public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Long> {
}

