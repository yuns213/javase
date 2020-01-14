package com.day13.Test0204;

import java.util.HashSet;
import java.util.Iterator;

public class Test0204 {

    public static void main(String[] args) {


        HashSet<Student> students = new HashSet<>();

        Student student = new Student("张三",19,"男");
        Student student2 = new Student("李四",16,"女");
        Student student3 = new Student("王五",16,"男");
        Student student4 = new Student("钱六",16,"男");
        Student student5 = new Student("赵八",17,"女");
        Student student6 = new Student("张三",19,"男");
        Student student7 = new Student("张三",19,"男");
        Student student8 = new Student("黄叶",12,"女");
        Student student9 = new Student("惠雨",13,"女");
        Student student10 = new Student("耶稣",15,"男");


        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);


        Iterator<Student> it = students.iterator();

        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");
        for (Student s : students){
            System.out.println(s);
        }









    }
}
