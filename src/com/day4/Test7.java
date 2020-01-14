package com.day4;

public class Test7 {

    public static void main(String[] args) {


        int a = round(10.1f);
        System.out.println("10.1->"+a);
        int b = round(10.4f);
        System.out.println("10.4->"+b);
        int c = round(10.5f);
        System.out.println("10.5->"+c);
        int d = round(10.9f);
        System.out.println("10.9->"+d);
    }

    public static int round(float f) {
        //浮点转整型是强制转换,会失去一些精度.转换的时候一般会将小数点直接清除
        int sum = (int)(f+0.5);
        return sum;

    }

}
