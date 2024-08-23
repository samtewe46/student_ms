package com.student_ms.student.ms.repository;

import com.student_ms.student.ms.entity.Address;
import com.student_ms.student.ms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> getStudentByName(String name);

    List<Student> getStudentByGender(String gender);


}

