package com.example.Demo.demo.controller;

import com.example.Demo.demo.repository.IDepartmentRepository;
import com.example.Demo.demo.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService departmentService;
    private IDepartmentRepository departmentRepository;

    public DepartmentController(DepartmentService departmentService, IDepartmentRepository departmentRepository) {
        this.departmentService = departmentService;
        this.departmentRepository = departmentRepository;
    }

    public void getAllDepartment() {
        List<String> departments = departmentService.processDepartment();
        printDepartmentReport(departments);
    }

    public void printDepartmentReport(List<String> departments){

    }
}
