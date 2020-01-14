package com.day10.Test04;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {


        Apple a1 =new Apple(5,"青色");
        Apple a2 =new Apple(3,"红色");
        //定义工人类去挑拣
        Worker worker = new Worker();

        Compare c =new Compare();

        System.out.println("默认挑大的");
        //因为这里调用的worker的方法返回值是Apple的数据,所以可以定义对象是Apple的变量去接受
        //这里的调用用的是默认方法二选一的继承.
        Apple apple1  = worker.pickApple(c,a1,a2);
        //          这里的new Compare()可以不用再用变量c去接收
//        Apple apple1  = worker.pickApple(new Compare(),a1,a2);
        System.out.println(apple1.getSize()+"-"+apple1.getColor());

        System.out.println("挑红的:");
        //通过默认方法二选一,用重写的方式去完成,worke.pickApple(new Compare(){ // 重写方法()这里不能定义变量去使用} ,a1,a2)
        Apple apple2 = worker.pickApple(new Compare(){
            @Override
            public Apple compare(Apple a1, Apple a2) {
                if ("红色".equals(a1.getColor())){
                    return a1;
                }else{
                    return a2;
                }

            }
        },a1,a2);

        System.out.println(apple2.getSize()+"-"+apple2.getColor());








    }






}
