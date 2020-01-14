package com.day12.Stest02;

public class Person {

    private  String name;
    private  int age;
    private  double height;

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getheight() {
        return height;
    }

    public void setheight(double price) {
        this.height = price;
    }


}
