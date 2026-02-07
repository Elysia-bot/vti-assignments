package com.example.Demo.demo.service;

import com.example.Demo.demo.entity.Department;
import com.example.Demo.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Integer id, String newName) {
        Department dep = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
        dep.setName(newName);
        return departmentRepository.save(dep);
    }

    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}