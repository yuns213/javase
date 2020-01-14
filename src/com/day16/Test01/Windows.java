package com.day16.Test01;

public class Windows implements Runnable {
    //用车票作为参数
    private Fare fare;
    //用构造函数
    public Windows(Fare fare) {
        this.fare = fare;
    }
    //重写run方法
    @Override
    public void run() {
        //死循环窗口
        while (true) {

            synchronized (fare) {
                int num = fare.getNum();
                //当火车票小于0的时候,就跳出这个循环
                if (num<0){
                    System.out.println("票买完了哦");
                    break;
                }
                //打印每张车票
                System.out.println("车票:"+fare.getName()+" , 在窗口:"+Thread.currentThread().getName()+" 卖出, 票号:"+num);
                //每卖出一张就减一
                num--;
                //再把值给回fare;
                fare.setNum(num);


            }
        }


    }
}
