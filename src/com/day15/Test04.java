package com.day15;

public class Test04 {

    public static void main(String[] args) {

        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("播放背景音乐");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread =new Thread(runnable);

        thread.start();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println("显示画面");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();

    }
}
