package com.day4;

public class Test3 {


    public static void main(String[] args) {

        int length = 20;
        int wide  = 8;

        int zc  = getPerimeter(length,wide);

        int area =getArea(length,wide);

        System.out.println("长方形周长:"+zc);
        System.out.println("长方形面积:"+area);


    }

    public  static  int getPerimeter(int length,int width){

        return (length+width)*2;

    }
    public  static  int getArea(int length,int width){

        return length*width;

    }


}
