package com.day15.Test06;

public class Cup extends Thread{

        //数量作为数据传递
      private Sum sum ;
        //构造
    public Cup(Sum sum) {
        this.sum = sum;
    }

    //重写thread的run方法
    @Override
    public void run() {

        int count =sum.getNum();
        while (true){
            //用票创建的对象锁住

            synchronized (sum){
                sum.setNum(sum.getNum()-1);



                if (sum.getNum()<0){
                    System.out.println("限量水杯卖完了");
                    break;
                }


                System.out.println(currentThread().getName()+"卖出"+sum.getName()+"第"+(count-sum.getNum())+"个,总共剩余"+sum.getNum()+"个");

            }


        }


    }
}
