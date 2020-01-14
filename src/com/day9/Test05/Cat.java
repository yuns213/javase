package com.day9.Test05;

public class Cat extends Animal{

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}
