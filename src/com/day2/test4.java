package com.day2;

public class test4 {

    public static void main(String[] args) {
        int a = 1;
        double b= 2.333;
        double c= a+b;
        //这是自动转换
        System.out.println("结果"+c);
        //下列是强制转换,会改变值,下列把小数给清除了(会丢失一些精度)
        System.out.println("结果"+(int)c);

    }
}
