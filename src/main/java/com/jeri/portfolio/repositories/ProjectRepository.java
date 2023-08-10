package com.jeri.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jeri.portfolio.entities.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
