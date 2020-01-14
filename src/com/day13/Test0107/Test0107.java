package com.day13.Test0107;

import java.util.HashSet;
import java.util.Iterator;

public class Test0107 {
    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();
        Person p1 =new Person("艾希",11);
        Person p2 =new Person("艾希",11);

        Person p3 =new Person(" 月神",17);
        Person p4 =new Person("离火",12);


        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Iterator<Person> it = people.iterator();

        while (it.hasNext()){
            Person person = it.next();

            System.out.println(person);
        }
    }

}
