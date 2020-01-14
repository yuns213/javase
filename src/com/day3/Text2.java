package com.day3;

public class Text2 {

    public static void main(String[] args) {
        //这个sum是奇数的总和
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            //偶数除于2的余数为0,所以奇数除于2的余数是1.
            if (i % 2 == 1) {
                //通过if的i就是奇数,,然后用sum去想加
                sum += i;

            }

        }
        System.out.println("1-100的奇数累加和:" + sum);

    }

}
