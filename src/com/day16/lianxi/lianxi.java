package com.day16.lianxi;

public class lianxi {

    Object obj = new Object();


    int count = 1;
    public  void  show1() throws InterruptedException{
        synchronized (obj) {
            for (int i = 0; i < 10; i++) {

                if (count == 1) {
                    obj.notify();
                }
                System.out.print("人");
                System.out.print("在");
                System.out.print("江");
                System.out.print("湖");
                System.out.print("飘");
                System.out.println();

                count = 0;
                obj.wait();
            }
        }

    }

    public  void  show2() throws InterruptedException{
        synchronized (obj) {
            for (int i = 0; i < 10; i++) {

                if (count == 0) {
                    obj.notify();
                }
                System.out.print("哪");
                System.out.print("能");
                System.out.print("不");
                System.out.print("挨");
                System.out.print("刀");
                System.out.println();
                count = 1;
                obj.wait();
            }
        }

    }

}
