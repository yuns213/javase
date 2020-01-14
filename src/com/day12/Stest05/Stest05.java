package com.day12.Stest05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Stest05 {

    public static void main(String[] args) {
        Collection<Person> p = new ArrayList<>();

        Person s1 =new Person("剑圣",18,1.95);
        Person s2 =new Person("小法",19,1.85);
        Person s3 =new Person("千珏",20,1.91);
        Person s4 =new Person("塞纳",17,1.89);
        Person s5 =new Person("蚂蚱",20,1.86);
        p.add(s1);
        p.add(s2);
        p.add(s3);
        p.add(s4);
        p.add(s5);

        //创建迭代器
        Iterator<Person> it = p.iterator();


        //死循环迭代器将元素遍历出来
        while (it.hasNext()){
            //创建Person对象去获取集合的每一个元素
              Person person =   it.next();
              //用int对象去获取元素的年龄
              int ageadd = person.getAge();
              //用person的set方法去把每个年龄都加2岁
              person.setAge(ageadd+2);


            }
        //用增强for循环将每个元素遍历出来/在person类重写toString方法打印元素内容
        for (Person p1 : p) {
            System.out.println(p1);
        }
    }

}
