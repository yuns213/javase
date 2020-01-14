package com.day9.Test05;

public class Dog extends Animal {

    public void lookHome(){
        System.out.println("老老实实看家");
    }

    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
}
