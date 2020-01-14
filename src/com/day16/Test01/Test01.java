package com.day16.Test01;

public class Test01 {

    public static void main(String[] args) {
        ////创建票对象
        Fare fare = new Fare();
        fare.setNum(100);
        fare.setName("广州-武汉");
        //把票添加给窗口
        Windows windows = new Windows(fare);
        //创建多个窗口(多线程)
        Thread t = new Thread(windows,"广州西");
        t.start();
        Thread t2 = new Thread(windows,"广州东");
        t2.start();


    }


}
