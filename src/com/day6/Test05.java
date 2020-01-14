package com.day6;

import java.util.ArrayList;

public class Test05 {

    public static void main(String[] args) {

        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId() + "," + student.getName() + "," + student.getHeight());
        }
        System.out.println("----------------");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);

            if (student.getHeight() > 1.70) {
                System.out.println("身高1.70以上的学员:" + student.getId() + "," + student.getName() + "," + student.getHeight());
            }
        }
    }
}
