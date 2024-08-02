package com.student_ms.student.ms.service;

import com.student_ms.student.ms.entity.Student;
import com.student_ms.student.ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save (Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getStudentByGender(String gender) {
        return studentRepository.getStudentByGender(gender);
    }

    @Override
    public Student updateStudentById(Long id, Student studentDetails) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(studentDetails.getName());
            student.setGender(studentDetails.getGender());
            studentRepository.save(student);

        }
        return null;

    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}


