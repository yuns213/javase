package com.day12.Stest02;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Stest02 {

    public static void main(String[] args) {

        Collection<Person> p = new ArrayList<>();

        Person s1 =new Person("奥拉夫",18,1.95);
        Person s2 =new Person("鳄鱼",19,1.85);
        Person s3 =new Person("狗熊",20,1.91);
        Person s4 =new Person("武器大师",17,1.89);
        Person s5 =new Person("塞恩",20,1.86);
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(s4);
        p.add(s5);

        Iterator<Person> it = p.iterator();


        Person h =new Person("狗熊",20,1.91);
        Person o =new Person("狗熊",20,1.91);


        while (it.hasNext()){
            Person student =it.next();
            if (student.getheight()>h.getheight()){
                h =student;
            }
            if (student.getheight()<o.getheight()){
                o =student;
            }


        }
        System.out.println("最高的人是:"+h.getName()+" 身高:"+h.getheight());
        System.out.println("最矮的人是:"+o.getName()+" 身高:"+o.getheight());
    }

}
