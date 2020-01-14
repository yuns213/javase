package com.day16.lianxi2.lianxi;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class lianxi2 {


    ReentrantLock Lock = new ReentrantLock();

    Condition c1;
    Condition c2;

    public lianxi2() {
        c1 = Lock.newCondition();
        c2 = Lock.newCondition();
    }

    int count = 1;

    public void show1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Lock.lock();

            if (count == 1) {
                c1.signal();
            }
            System.out.print("人");
            System.out.print("在");
            System.out.print("江");
            System.out.print("湖");
            System.out.print("飘");
            System.out.println();

            count = 0;
            c1.await();
            Lock.unlock();
        }

    }

    public void show2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Lock.lock();

            if (count == 0) {
                c2.signal();
            }
            System.out.print("哪");
            System.out.print("能");
            System.out.print("不");
            System.out.print("挨");
            System.out.print("刀");
            System.out.println();
            count = 1;
            c2.await();
            Lock.unlock();
        }

    }

}
