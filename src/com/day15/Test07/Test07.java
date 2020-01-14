package com.day15.Test07;

public class Test07 {
    public static void main(String[] args) {

        Person person = new Person(80);

        Bus front = new Bus(person);
        front.setName("前门上车");
        Bus middle = new Bus(person);
        middle.setName("中门上车");
        Bus backdoor = new Bus(person);
        backdoor.setName("后门上车");

        front.start();
        middle.start();
        backdoor.start();

    }
}
