package com.day16.Test02;

public class EatBun implements Runnable {

    private Bun bun;

    public EatBun(Bun bun) {
        this.bun = bun;
    }


    @Override
    public void run() {


        while (true) {


            synchronized (bun) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int num = bun.getNum();
                if (num > 5) {

                    System.out.println("包子被" + Thread.currentThread().getName() + "了一个,还剩" + num);
                    bun.setNum(--num);
                    try {
                        bun.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else {
                    try {
                        //让包子继续做
                        bun.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
