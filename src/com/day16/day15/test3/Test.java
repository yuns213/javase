package com.day16.day15.test3;

public class Test {

    public static void main(String[] args) {
        Shower shower = new Shower();

        new Thread() {
            @Override
            public void run() {
                try {
                    shower.show1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    shower.show2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
