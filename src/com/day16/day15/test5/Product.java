package com.day16.day15.test5;

public class Product implements Runnable {

    private BaoZi baoZi = new BaoZi();

    public Product(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                //休息100毫秒
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int number = baoZi.getNumber();
                //包子数量小于10 ，需要生产包子（包子最多可以有10个）
                if (baoZi.getNumber() < 10) {
                    System.out.println("包子的数量：" + number + "," + Thread.currentThread().getName() + "生产了一个包子");
                    baoZi.setNumber(++number);
                    try {
                        //通知吃货来吃包子
                        baoZi.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        //有包子就等待
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
