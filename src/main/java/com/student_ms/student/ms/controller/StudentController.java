package com.student_ms.student.ms.controller;

import com.student_ms.student.ms.entity.Student;
import com.student_ms.student.ms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
   @Autowired
   StudentService studentService;
   @PostMapping("/register")
   public Student registerStudent(@RequestBody Student student) {
      return studentService.save(student);
   }

}
