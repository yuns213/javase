package com.day10.Test06;

public class Student {
    private String name;
    private int price;
    private int age;

    public Student(String name, int price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "," + price+","+age;
    }


}
