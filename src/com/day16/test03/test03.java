package com.day16.test03;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

    avg avg =new avg();

    FutureTask<Object> task = new FutureTask<>(avg);
    FutureTask<Object> task1 = new FutureTask<>(avg);
    FutureTask<Object> task2 = new FutureTask<>(avg);

    Thread thread = new Thread(task);
    thread.start();

    Thread thread1 = new Thread(task1);
    thread1.start();
    Thread thread2 = new Thread(task2);
    thread2.start();



        System.out.println("第一个平均数: "+task.get());
        System.out.println("第二个平均数: "+task1.get());
        System.out.println("第三个平均数: "+task2.get());

        int Avg = ((int)task.get()+(int)task1.get()+(int)task2.get())/3;
        System.out.println("三个平均数的平均数: "+Avg);

    }


}
