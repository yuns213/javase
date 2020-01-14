package com.day10.Test02;

import java.util.ArrayList;

public class Class {

    private String ClassName;
    private Teacher t;
    private ArrayList<Student> student =new ArrayList<>();

    public Class() {
    }

    public Class(String className, Teacher t, ArrayList<Student> student) {
        ClassName = className;
        this.t = t;
        this.student = student;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public void show(){
        System.out.println("课程名称:"+ClassName);
        System.out.println("授课老师:"+t.getName());

        for (int i = 0; i < student.size(); i++) {
            Student s = student.get(i);
            if (s.isTofw()==true){
                System.out.println("上课: "+s.getName());
            }else{
                System.out.println("旷课: "+s.getName());
            }

        }


    }
}
