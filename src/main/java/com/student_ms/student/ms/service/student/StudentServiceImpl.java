package com.student_ms.student.ms.service.student;

import com.student_ms.student.ms.entity.Department;
import com.student_ms.student.ms.entity.Student;
import com.student_ms.student.ms.repository.DepartmentRepo;
import com.student_ms.student.ms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentRepo departmentRepo;
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

    @Override
    public Student addDepartmentToStudent(Long studentId, Long departmentId) {

            Optional<Student> studentOpt = studentRepository.findById(studentId);
            Optional<Department> departmentOpt = departmentRepo.findById(departmentId);

            if (studentOpt.isPresent() && departmentOpt.isPresent()) {
                Student student = studentOpt.get();
                Department department = departmentOpt.get();

                student.setDepartment(department);
                return studentRepository.save(student);
            } else {
                throw new RuntimeException("Student or Department not found");
            }

    }


}


