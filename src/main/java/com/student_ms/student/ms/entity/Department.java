package com.student_ms.student.ms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String code;
    @OneToMany
    private Set<Student> students;
}
