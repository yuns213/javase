package com.day15;

public class lianxi2 {
    public static void main(String[] args) {
        Thread thread = new Thread("两只老虎") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + "在" + "玩耍"+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        thread.start();


        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                    System.out.println(thread.getName() + "打架" + i);
                if (i ==50) {
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "看戏"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread1 = new Thread(runnable, "企鹅");
        thread1.start();


        for (int i = 0; i <10; i++) {
            System.out.println("main"+i);

        }

    }
}
