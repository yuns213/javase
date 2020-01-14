package com.day16.lianxi;

public class ceshi {

    public static void main(String[] args) {

        lianxi lianxi = new lianxi();

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
