package com.day16.day15.test2;



public class MyRun1 implements Runnable {

    private Entity entity;

    public MyRun1(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        synchronized (entity) {
            for (int i = 0; i < 10; i++) {
                System.out.println("i:" + i);
                try {
                    //无限等待，会释放锁
//                    entity.wait();
                    entity.wait(1000);
//                    Thread.sleep(1000);

                    // wait()和sleep()的区别
                    // wait()会释放锁，sleep()不会释放锁

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
