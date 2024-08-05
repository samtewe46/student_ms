package com.student_ms.student.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name= "city_name")
    private String city;
    private String country;
}
