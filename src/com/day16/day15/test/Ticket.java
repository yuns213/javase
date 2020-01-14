package com.day16.day15.test;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    private TicketBean ticketBean;

    public Ticket(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

       ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

//        lock.lock();
//        lock.unlock();

        while (true) {
            synchronized (ticketBean) {
                int num = ticketBean.getNum();
                if (num <= 0) {
                    break;
                }
                System.out.println("窗口：" + Thread.currentThread().getName() + ",卖票：" + ticketBean.getName() + ",票号：" + num);
                num--;
                ticketBean.setNum(num);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
