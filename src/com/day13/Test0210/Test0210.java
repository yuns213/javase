package com.day13.Test0210;

import java.util.HashSet;
import java.util.Iterator;

public class Test0210 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        Student student = new Student("张三", 18, 89);
        Student student1 = new Student("张三", 18, 79);
        Student student2 = new Student("李四", 19, 98);
        Student student3 = new Student("王五", 16, 93);
        Student student4 = new Student("徐宇", 18, 79);
        hashSet.add(student);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);


        Iterator<Student> it = hashSet.iterator();

        double sum = 0;
        double max = 89;
        double min = 89;
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);


        }





        for (Student s : hashSet) {
            double i = s.getPrice();

            sum += i;

            if (max < i) {

                max = i;
            }

            if (min > i) {

                min = i;
            }

        }

        double avg = sum / hashSet.size();

        System.out.println("总分是:" + sum);
        System.out.println("平均分是:" + avg);
        System.out.println("最高分是:" + max);
        System.out.println("最低分是:" + min);


    }
}
