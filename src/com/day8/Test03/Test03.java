package com.day8.Test03;

public class Test03 {
    public static void main(String[] args) {


        //        第三题
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();
        dog.lookHome();
        System.out.println("--------------------");

        Cat cat = new Cat();
        cat.name = "波斯猫";
        cat.eat();
        cat.catchMouse();

    }
}


