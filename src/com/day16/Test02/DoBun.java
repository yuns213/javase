package com.day16.Test02;

public class DoBun implements Runnable {

    private Bun bun;

    public DoBun(Bun bun) {
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
                if (bun.getNum() < 10) {

                    System.out.println("包子在" + Thread.currentThread().getName() + "生产了一个,现在有" + num);
                    bun.setNum(++num);
                    bun.notify();


                } else {
                    try {
                        //让猪猪吃
                        bun.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
