package com.jeri.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jeri.portfolio.entities.Resume;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}

