package com.example.Demo.demo.service;

import com.example.Demo.demo.repository.AccountRepository;
import com.example.Demo.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;


    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;

    }

    public List<String> getAllDepartment() {
        return departmentRepository.getAllDepartment();
    }

    public List<String> processDepartment() {
        List<String> departments = getAllDepartment();
        return departments;
    }
}
