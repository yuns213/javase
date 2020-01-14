package com.day8.Test06;

public class Cock extends Poultry{

    public Cock() {
    }

    public Cock(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }

    public  void Moo(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
