package com.day16.day15.test4.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Shower {

    ReentrantLock lock = new ReentrantLock();

    Object obj = new Object();

    int count = 0;

    // 监视器
    Condition c1;
    Condition c2;

    public Shower() {
        c1 = lock.newCondition();
        c2 = lock.newCondition();
    }

    public void show1() throws Exception {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            if (count == 0) {
                c1.signal();
            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 1;
            c2.await();
            lock.unlock();
        }
    }

    public void show2() throws Exception {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            if (count == 1) {
                c2.signal();
            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 0;
            c1.await();
            lock.unlock();
        }
    }
}
