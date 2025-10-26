package com.example.assignmenttracking.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String progressStatus;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
}
