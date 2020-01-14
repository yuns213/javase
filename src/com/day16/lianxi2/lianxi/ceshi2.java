package com.day16.lianxi2.lianxi;

public class ceshi2 {

    public static void main(String[] args) {

        lianxi2 lianxi = new lianxi2();

       new Thread(()->{
           try {
               lianxi.show1();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }).start();

       new Thread(){
           @Override
           public void run() {
               try {
                   lianxi.show2();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }.start();


    }
}
