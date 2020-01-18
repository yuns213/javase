package com.day21;

public class lianxi2 {
    public static void main(String[] args)throws Exception {
        //第一种,通过类名.class
        Class c = Person.class;
        System.out.println(c);
        //第二种 通过对象名.getClass
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        //第三种
        Class c2 = Class.forName("java.lang.String");
        System.out.println(c2);
    }
}
