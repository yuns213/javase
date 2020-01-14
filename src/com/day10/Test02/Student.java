package com.day10.Test02;

public class Student {

    private String name;
    private boolean tofw;

    public Student() {
    }

    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTofw() {
        return tofw;
    }

    public void setTofw(boolean tofw) {
        this.tofw = tofw;
    }
}
