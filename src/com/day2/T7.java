package com.day2;

public class T7 {

    public static void main(String[] args) {
        int add = add(100,200);
        int sub = sub(100,200);
        int mul = mul(100,200);
        int div = div(100,200);
        int remain = remain(100,200);


        System.out.println("x,y的和为:"+add);
        System.out.println("x,y的差为:"+sub);
        System.out.println("x,y的积为:"+mul);
        System.out.println("x,y的积为:"+div);
        System.out.println("x,y的积为:"+remain);
    }

    public static int add(int x,int y){
        int c= x+y;
        return c;


    }

    public static int sub(int x,int y){
        int c= x-y;
        return c;


    }
    public static int mul(int x,int y){
        int c= x*y;
        return c;


    }
    public static int div(int x,int y){
        int c= x/y;
        return c;


    }
    public static int remain(int x,int y){
        int c= x%y;
        return c;


    }


}
