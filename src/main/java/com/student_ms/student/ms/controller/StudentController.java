package com.student_ms.student.ms.controller;


import com.student_ms.student.ms.entity.Department;
import com.student_ms.student.ms.entity.Student;
import com.student_ms.student.ms.service.department.DepartmentService;
import com.student_ms.student.ms.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/school/student")
@RequiredArgsConstructor
public class StudentController {

   private final StudentService studentService;
   private final DepartmentService departmentService;

    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/name/{name}")
    public List<Student> getStudent(@PathVariable String name) {
        return studentService.getStudentByName(name);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {

        Optional<Student> student = studentService.getStudentById(id);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }

    }

    @GetMapping("/gender/{gender}")
    public List<Student> getGender(@PathVariable String gender) {
        return studentService.getStudentByGender(gender);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudentById(id, student);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id) {
        Optional<Student> student = studentService.getStudentById(id);
        if (student.isPresent()) {
            studentService.deleteStudentById(id);
            return ResponseEntity.ok("Student deleted successfully");
        } else return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
    }
    @PostMapping("/{studentId}/department/{departmentId}")
    public Student addDepartmentToStudent(@PathVariable Long studentId, @PathVariable Long departmentId) {
        return studentService.addDepartmentToStudent(studentId, departmentId);
    }


}
