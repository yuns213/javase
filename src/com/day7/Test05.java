package com.day7;

public class Test05 {


    public static void main(String[] args) {

        int s = Math.abs(8);
        int s1 = Math.abs(-9);
        double d = Math.ceil(6.1);
        double d1 = Math.ceil(-6.1);
        double d2 = Math.floor(6.8);
        double d3 = Math.floor(-6.8);
        double d4 = Math.round(5.88);
        double d5 = Math.round(-5.88);

        System.out.println("8的绝对值:" + s);
        System.out.println("-9的绝对值:" + s1);
        System.out.println("6.1向上取整的值:" + d);
        System.out.println("-6.1向上取整的值:" + d1);
        System.out.println("6.8向下取整的值:" + d2);
        System.out.println("-6.8向下取整的值:" + d3);
        System.out.println("5.88四舍五入的值:" + (int) d4);
        System.out.println("-5.88四舍五入的值:" + (int) d5);


    }
}
