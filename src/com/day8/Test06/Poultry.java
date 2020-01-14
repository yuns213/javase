package com.day8.Test06;

abstract class Poultry {
    private int age;
    private String color;

    public Poultry() {
    }

    public Poultry(int age, String color) {
        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract  void  eat();
}


