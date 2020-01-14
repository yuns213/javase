package com.day12.Stest01;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Stest01 {

    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        Student s1 =new Student("艾希",18,98);
        Student s2 =new Student("EZ",19,85);
        Student s3 =new Student("老鼠",20,95);
        Student s4 =new Student("大嘴",17,92);
        Student s5 =new Student("vn",20,89);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        Iterator<Student> it = c.iterator();

        double sum = 0;
        double max = 85;
        double min = 89;
        double avg = 0;

        while (it.hasNext()){
            Student student =it.next();
            sum += student.getPrice();

            if (student.getPrice()>max){
                max =student.getPrice();
            }
            if (student.getPrice()<min){
                min = student.getPrice();
            }
            avg = (sum/5);

        }
        System.out.println("总分:"+sum+" 最高分:"+max+" 最低分"+min+" 平均分:"+avg);
    }

}
