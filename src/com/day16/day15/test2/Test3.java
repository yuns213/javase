package com.day16.day15.test2;

public class Test3 {

    public static void main(String[] args) {

        Entity entity = new Entity();
        MyRun1 myRun1 = new MyRun1(entity);
        MyRun2 myRun2 = new MyRun2(entity);

        Thread thread = new Thread(myRun1);
        Thread thread2 = new Thread(myRun2);

        thread.start();
        thread2.start();

    }
}
