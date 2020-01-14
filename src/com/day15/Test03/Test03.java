package com.day15.Test03;

public class Test03 {

    public static void main(String[] args) {
        System.out.println("--hello!--");

//        Thread thread = new Thread("世界");

        Trick trick = new Trick();

        trick.start();

        Trick1 trick1 = new Trick1();

        Thread thread = new Thread(trick1);
        thread.start();



    }
}
