package com.day16.day15.test2;

public class MyRun2 implements Runnable {

    private Entity entity;

    public MyRun2(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (entity) {
//                entity.notify();
//                entity.notifyAll();
            }
        }
    }
}
