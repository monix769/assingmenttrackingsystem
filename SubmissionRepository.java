package com.example.assignmenttracking.repository;

import com.example.assignmenttracking.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
