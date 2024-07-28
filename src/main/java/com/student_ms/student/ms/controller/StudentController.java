package com.student_ms.student.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @GetMapping("/greetings")
    public String sayHello(){
        return "Hello Student";
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye! Stay safe";
    }
}
