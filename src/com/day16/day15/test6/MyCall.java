package com.day16.day15.test6;

import java.util.concurrent.Callable;

public class MyCall implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
            System.out.println(i);
        }

        return "hello";
    }
}
