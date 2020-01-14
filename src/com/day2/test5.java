package com.day2;

public class test5 {
    //public 公共的    static 静态的   void空
    public static void main(String[] args) {
        int  i=1;
        int  j=1;
        //实际参数
        int  w =sum2(2,3);
        System.out.println("2的答案"+w);
    }

    public static int  sum2(int v,int f){
      int c = v+f;
      return c;

    };
    //a b  实际参数
    public  static void sum(int a,int b){
        int  c  = a+b;
        System.out.println("加法"+c);
    }

}
