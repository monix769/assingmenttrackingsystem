package com.example.assignmenttracking.repository;

import com.example.assignmenttracking.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
