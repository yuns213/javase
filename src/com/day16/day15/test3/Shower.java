package com.day16.day15.test3;

public class Shower {

    Object obj = new Object();

    int count = 0;

    public void show1() throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (obj) {
                if (count == 0) {
                    obj.notify();
                }
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count = 1;
                obj.wait();
            }
        }
    }

    public void show2() throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (obj) {
                if (count == 1) {
                    obj.notify();
                }
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count = 0;
                obj.wait();
            }
        }
    }
}
