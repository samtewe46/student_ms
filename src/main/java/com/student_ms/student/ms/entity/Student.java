package com.student_ms.student.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String gender;
    @OneToOne (cascade = CascadeType.ALL, orphanRemoval = true)
    private Address address;
    @ManyToOne
    private Department department;
}
