package com.example.Demo.demo.entity;

import java.util.Date;

public class Account {
    private static int counter = 0;
    private int accountID;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private Date createDate;

    public  Account(int accountID, String email, String userName, String firstName, String lastName) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + lastName;
    }
}
