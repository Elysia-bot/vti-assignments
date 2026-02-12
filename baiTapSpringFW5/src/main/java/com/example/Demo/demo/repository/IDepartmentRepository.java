package com.example.Demo.demo.repository;

import com.example.Demo.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    public List<String> getAllDepartment();
    public void createDepartment();
}
