package com.day21;

public class Person {

    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("构造代码块");
    }

    private String name;
    private int age;


    public Person() {
        System.out.println("无参构造");
    }

    public Person(String name, int age) {
        System.out.println("全参构造");
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        System.out.println("私有构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
