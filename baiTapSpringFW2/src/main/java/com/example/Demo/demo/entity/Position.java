package com.example.Demo.demo.entity;

public class Position {
    private static int counter = 0;
    private int positionID;
    private String name;
    public Position(int positionID, String  name) {
        this.name = name;
        this.positionID = positionID;
    }
}
