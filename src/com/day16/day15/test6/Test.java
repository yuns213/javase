package com.day16.day15.test6;

import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall();
        FutureTask<Object> task = new FutureTask<>(myCall);
        Thread thread = new Thread(task);
        thread.start();
//        Object obj = task.get();
//        System.out.println(obj);

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
        }
    }
}
