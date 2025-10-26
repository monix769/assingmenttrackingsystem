package com.example.assignmenttracking.repository;

import com.example.assignmenttracking.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
