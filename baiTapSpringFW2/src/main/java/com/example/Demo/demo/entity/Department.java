package com.example.Demo.demo.entity;

public class Department {
    private int departmentID;
    private static int counter = 0;
    private String name;


    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;
    }
}