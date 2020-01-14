package com.day10.Test02;

import java.util.ArrayList;

public class Teacher {

    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianName(ArrayList<Student> student){
        for (int i = 0; i < student.size(); i++) {
            Student s = student.get(i);
            if(!s.getName().equals("小明")){
                s.setTofw(true);
            }
        }
    }
}
