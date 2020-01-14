package com.day8.Test05;

public class Test05 {

    public static void main(String[] args) {

        Teacher teacher =new Teacher();
        teacher.setName("王小平");
        teacher.setStudyClass("Java课");

        teacher.study();

        Student student = new Student();
        student.setName("李小乐");
        student.setCount(90);
        student.test();
    }
}
