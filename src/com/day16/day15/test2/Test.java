package com.day16.day15.test2;

public class Test {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(Thread.currentThread().getName() + ",1hello");
                        synchronized (s2) {
                            System.out.println(Thread.currentThread().getName() + ",2world");
                        }
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + ",3world");
                        synchronized (s1) {
                            System.out.println(Thread.currentThread().getName() + ",4hello");
                        }
                    }
                }
            }
        }.start();

    }
}
