package com.day10.Test02;

import java.util.ArrayList;

public class Test02 {

    public static void main(String[] args) {
        Teacher t = new Teacher("张老师");

        ArrayList<Student> students= new ArrayList<>();

        Student t1 = new Student("小红");
        Student t2 = new Student("小亮");
        Student t3 = new Student("小明");
        students.add(t1);
        students.add(t2);
        students.add(t3);

        Class c = new Class("java",t,students);

        t.dianName(students);

        c.show();

    }
}
