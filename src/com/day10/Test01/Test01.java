package com.day10.Test01;

public class Test01 {

    public static void main(String[] args) {

        HandleAble handleAble = new HandleAble() {
            @Override
            public void HandleString(String num) {
                double a=Double.valueOf(num);
                int i = (int)a;
          double d = Math.round(a * 10000) * 0.0001d;

                System.out.println("原数字:"+num);
                System.out.println("取整后:"+i);
                System.out.println("保留四位小数后:"+d);
            }
        };
        handleAble.HandleString("23.23456789");

    }

}
