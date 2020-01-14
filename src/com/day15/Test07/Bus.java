package com.day15.Test07;

public class Bus extends Thread{

    private  Person person;

    public Bus(Person person) {
        this.person = person;
    }


    @Override
    public void run() {

        while (true) {

            synchronized (person) {
                person.setSeat(person.getSeat() - 1);

                if (person.getSeat() < 0) {
                    System.out.println("本次列车不提供站位,请不要再上车!");
                    break;
                }

                System.out.println(currentThread().getName()+"---还剩"+person.getSeat()+"个座位");

            }
        }
    }
}
