package com.day9.Test05;

public class Test05 {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();
        Animal animal1 = new Cat();
        animal1.eat();

        Dog dog = (Dog)animal;
        dog.lookHome();
        Cat cat = (Cat)animal1;
        cat.catchMouse();

    }
}
