package com.day2;

public class test1 {
    public static void main(String[] args) {


        op3();
    }

    public static  void op3(){
        int u= 2;
        int s= 34;
        int v= 22;

        //先比较两个数的大小
        int tmp = u>s?u:s;

        //再比较较大的数和第三个数的比较
        int max = tmp >v?tmp:v;
        System.out.println("最大的数："+max);
    }


}

