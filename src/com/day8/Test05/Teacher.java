package com.day8.Test05;

public class Teacher extends Person {
    String studyClass;

    public Teacher(){

    }

    public Teacher(String studyClass) {
        this.studyClass = studyClass;
    }

    public String getStudyClass() {
        return studyClass;
    }

    public void setStudyClass(String studyClass) {
        this.studyClass = studyClass;
    }

    public void study(){
        System.out.println(super.getName()+"老师,讲授"+studyClass);
    }
}
