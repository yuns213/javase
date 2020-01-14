package com.day16.day15.test5;

public class Customer implements Runnable {

    private BaoZi baoZi = new BaoZi();

    public Customer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int number = baoZi.getNumber();
                //包子数量大于5，可以吃包子（包子至少有5个以上才可以吃）
                if (number > 5) {
                    System.out.println("包子的数量：" + number + "," + Thread.currentThread().getName() + "吃了一个包子");
                    baoZi.setNumber(--number);
                    //通知生产者生产包子
                    baoZi.notify();
                } else {
                    try {
                        //包子数量低于5，没包子吃，等待
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
