package com.example.assignmenttracking.repository;

import com.example.assignmenttracking.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
