package com.day16;

public class test04 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long l = 1;
                long sum = 0;
                for (int i = 1; i <= 10; i++) {
                    l = l * i;

                    sum += l;

                }
                System.out.println("10!的运算结果是:"+sum);

            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(() -> {
            long l = 1;
            long sum = 0;
            for (int i = 1; i <= 5; i++) {
                l = l * i;

                sum += l;


            }
                System.out.println("5!的运算结果是:"+sum);
        });

        thread2.start();


        new Thread() {
            @Override
            public void run() {
                long l = 1;
                long sum = 0;
                for (int i = 1; i <= 8; i++) {
                    l = l * i;

                    sum += l;

                }
                System.out.println("8!的运算结果是:"+sum);
            }
        }.start();
    }


}
