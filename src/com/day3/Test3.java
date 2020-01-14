package com.day3;

public class Test3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i);
            }

        }
        System.out.println("1-100之间即是3的倍数又是5的倍数的是:" + sum);
    }
}
