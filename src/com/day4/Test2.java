package com.day4;

public class Test2 {

    public static void main(String[] args) {


       int a =  getSum(100);
        System.out.println("总和为："+a);

    }

    public static int getSum(int n) {

        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
        }
        return sum;
    }
}
