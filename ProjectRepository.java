package com.example.assignmenttracking.repository;

import com.example.assignmenttracking.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
