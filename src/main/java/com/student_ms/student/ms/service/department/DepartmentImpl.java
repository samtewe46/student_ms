package com.student_ms.student.ms.service.department;

import com.student_ms.student.ms.entity.Department;
import com.student_ms.student.ms.repository.DepartmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentImpl implements DepartmentService{
    private final DepartmentRepo departmentRepo;

    @Override
   public Department save(Department department){
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepo.findAll();
    }
}
