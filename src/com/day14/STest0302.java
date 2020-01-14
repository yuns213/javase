package com.day14;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class STest0302 {

    public static void main(String[] args) {
        MyRunnable3 mr = new MyRunnable3();
        mr.start();
   MyRunnable3 mr2 = new MyRunnable3();
        mr2.start();
   MyRunnable3 mr1 = new MyRunnable3();
        mr1.start();



    }
}

    class MyRunnable3 extends Thread {


        @Override
        public void run() {

            Object obj =new  Object();
            HashSet<Integer> set = new HashSet<>();

            while (true) {
                synchronized (obj) {
                    Random random = new Random();
                    int i = random.nextInt(900) + 100;

                    set.add(i);
                    if (set.size() > 10) {
                        break;
                    }

                }
            }
            int sum = 0 ;
            for (int i :set){

                sum += i;

            }
            System.out.println(sum);
        }


    }


