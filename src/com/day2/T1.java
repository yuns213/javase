package com.day2;

public class T1 {

    public static void main(String[] args) {

        rec();
    }

    public static void rec(){
        int length = 24;
        int wide  = 5;
        int area = length*wide;
        int per = (length+wide)*2;

        System.out.println("长方形的面积为:"+area+",周长为"+per);

    }
}
