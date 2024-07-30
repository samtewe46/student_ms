package com.student_ms.student.ms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String gender;
}
