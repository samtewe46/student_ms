package com.student_ms.student.ms.service.department;

import com.student_ms.student.ms.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department save(Department department);

    List<Department> getAll();
}
