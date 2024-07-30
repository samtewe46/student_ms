package com.student_ms.student.ms.service;

import com.student_ms.student.ms.entity.Student;
import com.student_ms.student.ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save (Student student) {

        return studentRepository.save(student);
    }

}
