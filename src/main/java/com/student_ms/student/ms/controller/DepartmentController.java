package com.student_ms.student.ms.controller;

import com.student_ms.student.ms.entity.Department;
import com.student_ms.student.ms.service.department.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school/department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @PostMapping("/add")
    public Department createDepartmnet(@RequestBody Department department) {
        return departmentService.save(department);
    }
    @GetMapping()
    public List<Department> getAllDepartment() {

        return departmentService.getAll();
    }

}
