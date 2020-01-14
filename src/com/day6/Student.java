package com.day6;

public class Student {

    private String id  = "2322";
    private String name  = "";
    private double height = 0;


    public Student() {
    }

    public Student(String id, String name, double height) {


        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
