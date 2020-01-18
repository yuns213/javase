package com.day21;

public class lianxi3 {
    public static void main(String[] args) throws  Exception{
        Class c = Person.class;
        //获取简单类名(getsimpleName)
        System.out.println(c.getSimpleName());
        //获取完整类名(getName)
        System.out.println(c.getName());
        //创建对象(要求必须有无参数的构造方法)  这个对象是无法打印出来的
        System.out.println(c.newInstance());
    }
}
