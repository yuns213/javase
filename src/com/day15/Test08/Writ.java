package com.day15.Test08;

import java.util.concurrent.locks.ReentrantLock;

public class Writ extends  Thread{

    private  Num num;

    public Writ(Num num) {
        this.num = num;
    }

    ReentrantLock lock = new  ReentrantLock();
    @Override
    public void run() {

        while (true){

            lock.lock();

            if (num.getSeat()<0){
                System.out.println("票卖完咯~请选择其他列车出行吧~");
                lock.unlock();
                break;
            }

            System.out.println(currentThread().getName()+"卖掉了一张票,剩余票数为:"+num.getSeat());

            num.setSeat(num.getSeat()-1);


            lock.unlock();




        }

    }
}
