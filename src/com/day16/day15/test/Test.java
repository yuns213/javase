package com.day16.day15.test;

public class Test {

    public static void main(String[] args) {

        TicketBean bean = new TicketBean();
        bean.setName("广州南--北京");
        bean.setNum(100);

        Ticket ticket = new Ticket(bean);
        Thread t1 = new Thread(ticket, "广州南");
        Thread t2 = new Thread(ticket, "深圳北");
        t1.start();
        t2.start();

    }
}
