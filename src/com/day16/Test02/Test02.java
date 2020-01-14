package com.day16.Test02;

public class Test02 {


    public static void main(String[] args) {

    Bun bun = new Bun();
    bun.setNum(6);
    EatBun eatBun = new EatBun(bun);
    DoBun doBun = new DoBun(bun);

    Thread thread = new Thread(eatBun,"猪猪 ");
    thread.start();
    Thread thread1 = new Thread(doBun,"厨师");
    thread1.start();

    }



}
