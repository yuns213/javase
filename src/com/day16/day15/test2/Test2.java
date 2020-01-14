package com.day16.day15.test2;

import java.util.Date;

public class Test2 {

    public static void main(String[] args) {

        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                synchronized (obj) {

                    for (int i = 0; i < 10; i++) {
                        System.out.println("i:" + i);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
