package com.student_ms.student.ms.service.student;

import com.student_ms.student.ms.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save( Student student);

    List<Student> getStudentByName(String name);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    List<Student> getStudentByGender(String gender);

    Student updateStudentById(Long id, Student student);

    void deleteStudentById(Long id);

    Student addDepartmentToStudent(Long studentId, Long departmentId);
}
