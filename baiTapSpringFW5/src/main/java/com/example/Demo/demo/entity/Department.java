package com.example.Demo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private int departmentID;
    private static int counter = 0;

    @Column(name = "DepartmentName", length = 30,nullable = false, unique = true)
    private String name;


    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getName() {
        return name;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void setName(String name) {
        this.name = name;
    }
}