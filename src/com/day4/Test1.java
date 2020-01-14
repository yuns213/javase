package com.day4;

public class Test1 {
    public static void main(String[] args) {


        printEven(20);

    }

    public static void printEven(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
